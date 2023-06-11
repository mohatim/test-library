package com.project.library.dto;

import com.project.library.entities.Category;
import com.project.library.entities.Loan;
import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
public class BookDTO {

    private Integer id;

    private String title;

    private String isbn;

    private LocalDate releaseDate;

    private LocalDate registerDate;

    private Integer totalExamplaries;

    private String author;

    private Category category;

    //Set<Loan> loans;

}
