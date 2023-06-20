package com.example.loanapp.dto.response;

import com.example.loanapp.data.Enums.LoanType;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class LoanApplicationResponse {
    private BigDecimal loanAmount;
    private String loanPurpose;
    private LoanType loanType;
    private int tenureInMonths;
}
