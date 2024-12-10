package guru.springframework.spring6webapp.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String publisherName;
    private String address;
    private String city;
    private String state;
    private String zipCode;

    @OneToMany(mappedBy = "publisher")
    private Set<Book> books = new HashSet<>();
}
