package com.librarymap.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarymap.mapper.BookMapper;
import com.librarymap.pojo.Book;
import com.librarymap.pojo.BookExample;
import com.librarymap.pojo.BookExample.Criteria;
import com.librarymap.service.IbookService;
@Service
public class BookServiceImpl implements IbookService {
	
	@Autowired
	private BookMapper bookMapper;
	
	@Override
	public Book selectById(int id) {
		BookExample example = new BookExample();
		//添加查询条件
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		List<Book> list = bookMapper.selectByExample(example);
		if(list !=null && list.size() >0){
			Book book = list.get(0);
			return book;
		}
		return null;
	}

	@Override
	public List<Book> selectByLikeTitle(String title) {
		List<Book> list = bookMapper.selectByLikeExample("%"+title+"%");
		return list;
	}
	
}
