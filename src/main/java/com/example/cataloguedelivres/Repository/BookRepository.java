package com.example.cataloguedelivres.Repository;
import com.example.cataloguedelivres.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository< Book, Long> {
    @Query(value = "select * from book where date between :start and :and" , nativeQuery = true)
    List<Book> findBooksBetweenDates();

    @Query(value = "SELECT * FROM Book ORDER BY publicationDate DESC" , nativeQuery = true)
    List<Book> findAllOrderByPublicationDateDesc();
}
