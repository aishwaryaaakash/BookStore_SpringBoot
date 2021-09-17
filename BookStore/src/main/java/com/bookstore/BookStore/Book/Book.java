package com.bookstore.BookStore.Book;



public class Book {
	
	
	
	
	
	private String BookTitle;
	private String BookAuthor;
	private int BookPrice;
	private String PublishDate;
	
	public Book( String string, String string2, int j, String string3) {
		this.BookTitle=string;
		this.BookAuthor=string2;
		this.BookPrice=j;
		this.PublishDate=string3;
	}

	public String getBookTitle() {
		return BookTitle;
	}

	public void setBookTitle(String bookTitle) {
		BookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return BookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}

	public int getBookPrice() {
		return BookPrice;
	}

	public void setBookPrice(int bookPrice) {
		BookPrice = bookPrice;
	}

	public String getPublishDate() {
		return PublishDate;
	}

	public void setPublishDate(String publishDate) {
		PublishDate = publishDate;
	}
}
	
	
	
	
	