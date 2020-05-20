package com.company.OOP.LibraryManSystem;

import java.util.List;

public class Library {
    private List<Reader> readerList;
    private List<Book> bookList;

    public Library(List<Reader> readerList, List<Book> bookList) {
        this.readerList = readerList;
        this.bookList = bookList;
    }

    public List<Reader> getReaderList() {
        return readerList;
    }

    public void setReaderList(List<Reader> readerList) {
        this.readerList = readerList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void addBook(Book book) {
        bookList.add(book);
    }
}
