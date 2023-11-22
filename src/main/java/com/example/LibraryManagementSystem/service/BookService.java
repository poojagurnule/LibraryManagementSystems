package com.example.LibraryManagementSystem.service;

import com.example.LibraryManagementSystem.modules.Book;

import java.util.List;



public interface BookService {
    Book addBook(Book book);


    List<Book> getAllBooks();


    Book getBookById(Long id);


    void deleteBookById(Long id);
}
