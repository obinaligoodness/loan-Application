package com.example.loanapp.data.model;


import com.example.loanapp.data.Enums.LoanType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document
public class Loan {
    @Id
    private String Id;
    private BigDecimal loanAmount;
    private String loanPurpose;
    private LoanType loanType;
    private int tenureInMonths;
}
