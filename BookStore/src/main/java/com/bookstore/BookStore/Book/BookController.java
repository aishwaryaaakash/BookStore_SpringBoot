package com.bookstore.BookStore.Book;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(maxAge = 3600)
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	
	
	@RequestMapping(value="/books",method=RequestMethod.GET)
	public List<Book> getBooks(){
		return bookService.getAllTheBooks();
		
	}
	@RequestMapping(value="/books/addbook",method=RequestMethod.POST)
	public void addBook(@RequestBody Book book) {
		bookService.addBook(book);
	}
	

	@RequestMapping(value="/books/deletebook",method=RequestMethod.DELETE)
	public void deleteBook(@RequestBody Book book) {
		bookService.deleteBook(book);
	}
	
	
	

}
