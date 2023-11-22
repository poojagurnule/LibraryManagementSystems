package com.example.LibraryManagementSystem.controller;

import com.example.LibraryManagementSystem.modules.Author;
import com.example.LibraryManagementSystem.modules.Book;
import com.example.LibraryManagementSystem.service.BookService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
    private BookService bookService ;

    @PostMapping("/add")
    public ResponseEntity<Book> addBook(@RequestBody Book book){
           Book bookSaved =  bookService.addBook(book) ;
            return new ResponseEntity<>(bookSaved , HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> listOfBooks =  bookService.getAllBooks();
         return  new ResponseEntity<>(listOfBooks , HttpStatus.OK) ;

    }
    @GetMapping ("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id") Long id){
         Book bookRetrive = bookService.getBookById(id);
         return new ResponseEntity<>(bookRetrive , HttpStatus.OK) ;

    }

    @PutMapping("/update")
    public ResponseEntity<Book> updateBook(@RequestBody Book book){
       Book bookSaved = bookService.addBook(book) ;
       return new ResponseEntity<>(bookSaved ,HttpStatus.CREATED);
    }
     @DeleteMapping("delete/{id}")
    public  ResponseEntity<Void>  deleteBookById(@PathVariable("id") Long id){
            bookService.deleteBookById(id) ;
            return new ResponseEntity<>(HttpStatus.ACCEPTED) ;

    }
}
