package de.neuefische.librariesapi;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @ManyToMany
    @JoinTable(
        name = "libraries_books",
        joinColumns = @JoinColumn(name = "library_id"),
        inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    private List<Library> libraries;
}
