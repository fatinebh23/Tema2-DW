package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class BookCollection {
    private final List<Book> books;
    public BookCollection(Book[] books) {
        this.books = Arrays.asList(books);
    }
    public List<Book> find(String textToFind) {
        List<Book> foundBooks = new ArrayList<>();
        for(Book book : this.books){
            if(book.getISBN().equals(textToFind) ||
                    book.getTitle().contains(textToFind)){
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
}
