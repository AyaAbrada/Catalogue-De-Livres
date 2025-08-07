package com.example.cataloguedelivres.Controller;
import com.example.cataloguedelivres.Entities.Author;
import com.example.cataloguedelivres.Services.AuthorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
