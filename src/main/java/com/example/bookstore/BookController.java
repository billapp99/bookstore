package com.example.bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

// Your custom imports
[IMPORT THE BOOK MODEL]
[IMPORT THE BOOK REPOSITORY]

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BookController {

    BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {

        this.bookRepository = bookRepository;
    }

    @GetMapping("/books/")
    public Iterable<Book> getBooks() {
        [USE THE findAll COMMAND IN THE BOOK REPOSITORY TO RETURN ALL VALUES IN THE BOOK REPOSITORY]
    }

    @[INSERT CODE TO INDICATE A GET REQUEST]("/books/{id}")
    public Book getBook(@PathVariable("id") Long id) {
        return bookRepository.findById(id).get();
    }

    @PostMapping("/books/")
    public HttpStatus addBook(@RequestBody Book book){
        [INSERT A LINE SAVING THIS BOOK VARIABLE TO THE bookRepository]

        return HttpStatus.CREATED;
    }

}