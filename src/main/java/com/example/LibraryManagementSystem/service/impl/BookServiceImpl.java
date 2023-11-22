package com.example.LibraryManagementSystem.service.impl;

import com.example.LibraryManagementSystem.Repos.BookRepo;
import com.example.LibraryManagementSystem.modules.Book;
import com.example.LibraryManagementSystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepo bookRepo ;
    @Override
    public Book addBook(Book book) {
       return bookRepo.save(book) ;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepo.findById(id).get();
    }

    @Override
    public void deleteBookById(Long id) {
        bookRepo.deleteById(id);
    }


}
