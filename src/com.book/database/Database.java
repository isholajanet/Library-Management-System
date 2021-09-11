package com.books.database;

import com.Book;
import com.book.exceptions.BookNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {
    private List<Book> books = new ArrayList<>();

    public void setBookList(int bookId, String bookName, String writerName, double price, int quantity){


    }

    public void setBookList(Book book) {
        books.add(book);
    }

    public List<Book> getBookList() {
        return books;
    }

    public void deleteBook(Book book) throws BookNotFoundException {
        for(Book bookList: books){
            if(!(bookList.equals(book))){
                throw new BookNotFoundException(book.getBookName() + " does not exist in this library");
            }

        }
        books.remove(book);
    }

    public Book searchFor(String name) throws BookNotFoundException {
        Book foundBook = null;
        for(Book myBook: books){
            if(myBook.getBookName().equalsIgnoreCase(name) || myBook.getWriterName().equalsIgnoreCase(name)){
                foundBook = myBook;
                System.out.println(myBook);
            }else{
                throw new BookNotFoundException(name + " does not exist in the library");
            }
        }
        return foundBook;
    }
}
