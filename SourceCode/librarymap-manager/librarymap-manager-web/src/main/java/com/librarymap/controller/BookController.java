package com.librarymap.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.librarymap.pojo.Book;
import com.librarymap.service.IbookService;

@Controller
public class BookController {
	@Autowired
	private IbookService bookService;
	
	@RequestMapping("/book/{id}")
	@ResponseBody
	public Book getBookById(@PathVariable int id){
		Book book = bookService.selectById(id);
		return book;
	}
	
	@RequestMapping("/title/list")
	@ResponseBody
	public List<Book> getBookByLikeTitle(String title,HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException{
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		List<Book> books = bookService.selectByLikeTitle(title);
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i).getTitle());
		}
		return books;
	}
	
}
