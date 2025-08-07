package com.example.cataloguedelivres.Services;
import com.example.cataloguedelivres.Entities.Book;
import com.example.cataloguedelivres.Repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository bookRepository ;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book createBook(Book book){
        return bookRepository.save(book);
    }
}
