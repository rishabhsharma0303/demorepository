package com.bookapp.model.dao;

import java.util.List;

public interface BookDao {
	public List<Book> getAllBooks();
	public Book addBook(Book book);
	public Book delBook(int id);
	public Book updateBook(int id, double price);
	public Book getBookById(int id);
	public Book getBookByIsbn(String isbn);
}