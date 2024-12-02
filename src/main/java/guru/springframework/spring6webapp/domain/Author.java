package guru.springframework.spring6webapp.domain;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

/**
 * Created by vengeang, Spring Framework Guru.
 */
@Entity
@Data
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @ManyToMany(mappedBy = "author")
    private Set<Book> books;
}
