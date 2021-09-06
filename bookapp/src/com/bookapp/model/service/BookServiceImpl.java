package com.bookapp.model.service;

import java.util.List;


import com.bookapp.model.dao.Book;
import com.bookapp.model.dao.BookDao;
import com.bookapp.model.dao.BookDaoImpl;

public class BookServiceImpl implements BookService{

private BookDao bookDao;
	
	public BookServiceImpl() {
		bookDao=new BookDaoImpl();
	}

	@Override
	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}

	@Override
	public Book addBook(Book book) {
		return bookDao.addBook(book);
	}

	@Override
	public Book delBook(int id) {
		return bookDao.delBook(id);
	}

	@Override
	public Book updateBook(int id, double price) {
		return bookDao.updateBook(id, price);
	}

	@Override
	public Book getBookById(int id) {
		return bookDao.getBookById(id);
	}

	@Override
	public Book getBookByIsbn(String isbn) {
		return bookDao.getBookByIsbn(isbn);
	}

}