package com.project.library.dto;

import com.project.library.entities.Book;
import com.project.library.entities.LoanId;
import com.project.library.enums.LoanStatus;
import lombok.Data;

import java.time.LocalDate;

@Data
public class LoanDTO {

    private LoanId pk;

    private LocalDate loanBeginDate;

    private LocalDate loanEndDate;

    private LoanStatus status;

    private BookDTO bookDTO;

    private CustomerDTO customerDTO;
}
