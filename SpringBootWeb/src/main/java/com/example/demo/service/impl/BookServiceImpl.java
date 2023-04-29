package com.example.demo.service.impl;

import java.util.List;

import com.example.demo.entity.Book;
import com.example.demo.repositpory.BookRepository;
import com.example.demo.service.BookService;

public class BookServiceImpl implements BookService{
	BookRepository bookRepository;
	
	@Override
	public Book addBook(Book book) {
		
		return bookRepository.save(book);
	}


	@Override
	public List<Book> getallBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

}
