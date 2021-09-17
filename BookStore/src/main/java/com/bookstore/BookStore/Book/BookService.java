package com.bookstore.BookStore.Book;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
	private List<Book> list=new ArrayList<>();

	
	public BookService()
	{
		System.out.println("Service layer here");
		list.add(new Book("The Melting Words","Rahul",400,"2019-09-14"));
		list.add(new Book("Harry Potter","JKR",400,"1999-01-21"));
		list.add(new Book("Alice's Adventures","Lewis Caroll",800,"1986-07-09"));
	}
	
	public List<Book> getAllTheBooks()
	{
		return list;
	}
	public void addBook(Book book)
	{
		this.list.add(book);
	}
	

	public void deleteBook(Book book)
	{
		this.list.remove(book);
	}
	

	}
	
