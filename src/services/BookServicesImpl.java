package services;

import entities.Account;
import entities.Book;
import exceptions.BookAlreadyExistException;
import exceptions.BookNotFoundException;
import repositories.LibraryDb;

import java.util.ArrayList;
import java.util.List;

public class BookServicesImpl implements BookServices{
    public LibraryDb libraryDb;

    public BookServicesImpl(){
        libraryDb = new LibraryDb();
    }
    @Override
    public void addBook(Book book) throws BookAlreadyExistException {
        if(libraryDb.contains(book)){
            throw new BookAlreadyExistException("Book already exist");
        }else{
            libraryDb.add(book);
        }

    }

    @Override
    public Book requestBook(String searchString) throws BookNotFoundException {
        Book foundedBook = libraryDb.search(searchString);
        return foundedBook;
    }

    @Override
    public String feedBacks(Book book) {

        return null;
    }

    @Override
    public String showDueDate(Account account, String bookTitle) {
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return libraryDb.getBookDatabase();
    }

    @Override
    public void feedBacks(Book book, String feedback) throws BookNotFoundException {
        if(libraryDb.contains(book)){
            book.setFeedbacks(feedback);
        }else{
            throw new BookNotFoundException("Book does not exist");
        }
    }
}
