package com.example.LibraryManagementSystem.service;

import com.example.LibraryManagementSystem.modules.Author;
import com.example.LibraryManagementSystem.modules.Book;
import com.example.LibraryManagementSystem.service.impl.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AuthorService {


    public Author addAuthor(Author author);


    List<Author> getAllAuthor();

    Author getAuthorById(Long id);

    Author updateAuthor(Author author);

    void deleteAuthorById(Long id);
}
