package guru.springframework.spring6webapp.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

/**
 * Created by vengeang, Spring Framework Guru.
 */
@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String isbn;

    @ManyToMany
    @JoinTable(name = "author_book",joinColumns = @JoinColumn(name = "book_id"),inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors;
}
