package com.example.cataloguedelivres.Repository;
import com.example.cataloguedelivres.Entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
