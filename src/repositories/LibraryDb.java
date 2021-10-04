package repositories;

import entities.Book;
import exceptions.BookNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class LibraryDb {
    private final List<Book> bookDatabase = new ArrayList<Book>();



    public List<Book> getBookDatabase() {
        return bookDatabase;
    }

    public void add(Book book) {
        bookDatabase.add(book);
    }

    public void delete(Book book) {
        bookDatabase.remove(book);
    }

    public Book search(String searchString) throws BookNotFoundException {
        Book foundedBook = null;
        for(Book myBook: bookDatabase){
            if(myBook.getAuthor().equalsIgnoreCase(searchString) || myBook.getTitle().equalsIgnoreCase(searchString)){
                foundedBook = myBook;
            }else {
                throw new BookNotFoundException("Book not found");
            }
        }
        return foundedBook;
    }
    public Boolean contains(Book book){
        return bookDatabase.contains(book);
    }

}
