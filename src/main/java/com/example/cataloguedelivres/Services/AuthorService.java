package com.example.cataloguedelivres.Services;
import com.example.cataloguedelivres.Entities.Author;
import com.example.cataloguedelivres.Entities.Book;
import com.example.cataloguedelivres.Repository.AuthorRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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

    public ResponseEntity<Void> deleteAuthor(@PathVariable Long id) {
        System.out.println("Deleting author with ID: " + id);

        if (id == null || !authorRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        authorRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
