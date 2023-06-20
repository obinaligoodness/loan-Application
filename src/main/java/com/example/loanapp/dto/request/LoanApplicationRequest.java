package com.example.loanapp.dto.request;

import com.example.loanapp.data.Enums.LoanType;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class LoanApplicationRequest {
    private BigDecimal loanAmount;
    private String loanPurpose;
    private LoanType loanType;
    private int tenureInWeeks;
}
