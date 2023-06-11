package com.project.library.dto;

import lombok.Data;

import java.time.LocalDate;
@Data
public class SimpleLoanDTO {

    private Integer bookId;

    private Integer customerId;

    private LocalDate beginDate;

    private LocalDate endDate;
}
