package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.example.demo.entity.Book;
@Service
public interface BookService {
	public Book addBook(Book book);
	
	public List<Book> getallBooks();

//	List<Book> getAllBook();
}
