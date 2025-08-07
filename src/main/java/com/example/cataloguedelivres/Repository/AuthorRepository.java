package com.example.cataloguedelivres.Repository;
import com.example.cataloguedelivres.Entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    @Query(value = "select * from author where name like A%" , nativeQuery = true)
    List<Author> CommenceParLettre ();
}
