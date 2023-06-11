package com.project.library.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
@Table(name = "BOOK")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BOOK_ID")
    private Integer id;

    @Column(name ="TITLE", nullable = false)
    private String title;

    @Column(name="ISBN", nullable = false,unique = true)
    private String isbn;

    @Column(name="RELEASE_DATE",nullable = false)
    private LocalDate releaseDate;

    @Column(name = "REGISTER_DATE", nullable = false)
    private LocalDate registerDate;

    @Column(name = "TOTAL_EXAMPLARIES")
    private Integer totalExamplaries;

    @Column(name = "AUTHOR")
    private String author;

    @ManyToOne(optional = false)
    @JoinColumn(name = "CAT_CODE", referencedColumnName = "CODE")
    private Category category;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.book", cascade = CascadeType.ALL)
    Set<Loan> loans;
}
