package com.example.cataloguedelivres.Controller;
import com.example.cataloguedelivres.Entities.Author;
import com.example.cataloguedelivres.Entities.Book;
import com.example.cataloguedelivres.Services.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/author")
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping
    public Author createAuthor (@RequestBody Author author){
        return authorService.createAuthor(author);
    }

    @PutMapping
    public Author updateAuthor (@RequestBody Author author){
        return authorService.updateAuthor(author);
    }

    @GetMapping("/{id}")
    public Optional<Author> getById(@PathVariable Long id){
        return authorService.getById(id);
    }


    @DeleteMapping("/{id}")
    public void deleteBook(Long id){
        authorService.deleteAuthor(id);
    }


}
