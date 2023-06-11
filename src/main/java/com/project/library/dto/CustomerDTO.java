package com.project.library.dto;

import com.project.library.entities.Loan;
import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
public class CustomerDTO {

    private Integer id;

    private String firstName;

    private String lastName;

    private String job;

    private String address;

    private String email;

    private LocalDate creationDate;

//    Set<Loan> loans;
}
