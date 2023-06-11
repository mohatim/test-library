package com.project.library.entities;

import com.project.library.enums.LoanStatus;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "LOAN")
@AssociationOverrides({
        @AssociationOverride(name = "pk.book", joinColumns = @JoinColumn(name = "BOOK_ID")),
        @AssociationOverride(name = "pk.customer", joinColumns = @JoinColumn(name = "CUSTOMER_ID"))
})
public class Loan  implements Serializable{

    private static final long serialVersionUID = 144293603488149743L;

    @EmbeddedId
    private LoanId pk;

    @Column(name = "BEGIN_DATE", nullable = false)
    private LocalDate beginDate;

    @Column(name = "END_DATE", nullable = false)
    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS")
    private LoanStatus status;
}
