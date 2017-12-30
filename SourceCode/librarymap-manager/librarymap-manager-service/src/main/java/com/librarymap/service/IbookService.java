package com.librarymap.service;

import java.util.List;

import com.librarymap.pojo.Book;

public interface IbookService {
	Book selectById(int id);
	List<Book> selectByLikeTitle(String name);
	
}
