package services;

import entities.Account;
import entities.Book;
import exceptions.BookAlreadyExistException;
import exceptions.BookNotFoundException;

import java.util.List;

public interface BookServices {
    void addBook(Book book) throws BookAlreadyExistException;
    Book requestBook(String searchString) throws BookNotFoundException;
    String feedBacks(Book book);
    String showDueDate(Account account, String bookTitle);
    List<Book> getAllBooks();
    void feedBacks(Book book, String feedback) throws BookNotFoundException;
}
