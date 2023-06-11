package com.project.library.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Embeddable
public class LoanId implements Serializable {

    private static final long serialVersionUID = 3912193101593832821L;

    @ManyToOne
    private Book book;

    @ManyToOne
    private Customer customer;

    @Column(name = "CREATION_DATE_TIME")
    private LocalDateTime creationDateTime;

    public LoanId(Book book, Customer customer){
        super();
        this.book = book;
        this.customer = customer;
        this.creationDateTime = LocalDateTime.now();
    }

    public LoanId() {
        super();
    }
}
