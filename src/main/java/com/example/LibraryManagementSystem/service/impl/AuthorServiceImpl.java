package com.example.LibraryManagementSystem.service.impl;

import com.example.LibraryManagementSystem.Repos.AuthorRepo;
import com.example.LibraryManagementSystem.modules.Author;
import com.example.LibraryManagementSystem.modules.Book;
import com.example.LibraryManagementSystem.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
   private AuthorRepo authorRepo ;
    @Override
    public Author addAuthor(Author author) {
       Author savedAuthor = authorRepo.save(author) ;
       return  savedAuthor ;

    }

    @Override
    public List<Author> getAllAuthor() {
       return  authorRepo.findAll();
    }

    @Override
    public Author getAuthorById(Long id) {
        return authorRepo.findById(id).get() ;
    }

    @Override
    public Author updateAuthor(Author author) {
        return authorRepo.save(author);
    }

    @Override
    public void deleteAuthorById(Long id) {
            authorRepo.deleteById(id);
    }
}
