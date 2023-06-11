package com.project.library.services;

import com.project.library.dto.SimpleLoanDTO;
import com.project.library.entities.Loan;
import com.project.library.enums.LoanStatus;

import java.time.LocalDate;
import java.util.List;

public interface ILoanService {

    public List<Loan> findAllLoansByEndDateBefore(LocalDate maxEndDate);

    public List<Loan> getAllOpenLoansOfThisCustomer(String email, LoanStatus status);

    public Loan getOpenedLoan(SimpleLoanDTO simpleLoanDTO);

    public boolean checkIfLoanExists(SimpleLoanDTO simpleLoanDTO);

    public Loan saveLoan(Loan loan);

    public void closeLoan(Loan loan);
}
