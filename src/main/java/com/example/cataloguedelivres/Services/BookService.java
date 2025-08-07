package com.example.cataloguedelivres.Services;
import com.example.cataloguedelivres.Entities.Book;
import com.example.cataloguedelivres.Repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository ;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book createBook(Book book){
        return bookRepository.save(book);
    }

    public Book updateBook(Book book){
        return bookRepository.save(book);
    }

    public Optional<Book> getById(Long id) {
        return bookRepository.findById(id);
    }

}
