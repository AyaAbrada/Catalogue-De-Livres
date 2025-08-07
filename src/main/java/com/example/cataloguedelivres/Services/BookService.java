package com.example.cataloguedelivres.Services;
import com.example.cataloguedelivres.Entities.Book;
import com.example.cataloguedelivres.Repository.BookRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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

    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        System.out.println("Deleting book with ID: " + id);

        if (id == null || !bookRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        bookRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
