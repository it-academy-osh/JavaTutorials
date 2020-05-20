package com.company.OOP.LibraryManSystem;

public class Book {
    private int id;
    private String name;
    private boolean inStock;
    private Reader user;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
        this.inStock = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public Reader getUser() {
        return user;
    }

    public void setUser(Reader user) {
        this.user = user;
    }
}
