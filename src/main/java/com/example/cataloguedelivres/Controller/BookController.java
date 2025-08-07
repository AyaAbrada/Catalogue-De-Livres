package com.example.cataloguedelivres.Controller;
import com.example.cataloguedelivres.Entities.Book;
import com.example.cataloguedelivres.Services.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/book")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public Book createBook(@RequestBody Book book){
        return bookService.createBook(book);
    }

    @PutMapping
    public Book updateBook (@RequestBody Book book){
        return bookService.updateBook(book);
    }

    @GetMapping("/{id}")
    public Optional<Book> getById(@PathVariable Long id){
        return bookService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(Long id){
        bookService.deleteBook(id);
    }

}
