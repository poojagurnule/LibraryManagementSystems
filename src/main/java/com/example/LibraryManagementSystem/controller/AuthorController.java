package com.example.LibraryManagementSystem.controller;

import com.example.LibraryManagementSystem.modules.Author;
import com.example.LibraryManagementSystem.modules.Book;
import com.example.LibraryManagementSystem.service.AuthorService;
import com.example.LibraryManagementSystem.service.impl.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("author")
public class AuthorController {
    @Autowired
    AuthorService authorService;

    @PostMapping("/add")
    public ResponseEntity<Author> addAuthor(@RequestBody Author author) {
          Author authorSaved = authorService.addAuthor(author);
          return  new ResponseEntity<Author>(authorSaved , HttpStatus.CREATED) ;

    }

    @GetMapping("/all")
    public ResponseEntity<List<Author>> getAllAuthor() {
        List<Author> listOfAuthors =  authorService.getAllAuthor();
        return  new ResponseEntity<>(listOfAuthors , HttpStatus.OK) ;

    }
    @GetMapping ("/{id}")
    public ResponseEntity<Author> getAuthorById(@PathVariable("id") Long id){
        Author authorRetrived = authorService.getAuthorById(id);
        return new ResponseEntity<>(authorRetrived , HttpStatus.OK) ;

    }

    @PutMapping("/update")
    public ResponseEntity<Author> updateAuthor(@RequestBody Author author){
        Author authorSaved = authorService.updateAuthor(author) ;
        return new ResponseEntity<>(authorSaved ,HttpStatus.CREATED);
    }
    @DeleteMapping("delete/{id}")
    public  ResponseEntity<Void>  deleteAuthorById(@PathVariable("id") Long id){
        authorService.deleteAuthorById((id)) ;
        return new ResponseEntity<>(HttpStatus.ACCEPTED) ;

    }





}
