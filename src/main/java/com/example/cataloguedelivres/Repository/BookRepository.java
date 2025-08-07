package com.example.cataloguedelivres.Repository;
import com.example.cataloguedelivres.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository< Book, Long> {
}
