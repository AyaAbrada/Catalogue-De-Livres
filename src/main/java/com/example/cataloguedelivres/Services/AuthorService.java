package com.example.cataloguedelivres.Services;
import com.example.cataloguedelivres.Entities.Author;
import com.example.cataloguedelivres.Entities.Book;
import com.example.cataloguedelivres.Repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    public Author createAuthor(Author author){
        return authorRepository.save(author);
    }

    public Author updateAuthor(Author author){
        return authorRepository.save(author);
    }
    public Optional<Author> getById(Long id) {
        return authorRepository.findById(id);
    }
}
