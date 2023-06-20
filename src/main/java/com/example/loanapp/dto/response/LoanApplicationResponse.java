package dto.response;

import data.Enums.LoanType;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class LoanApplicationResponse {
    private BigDecimal loanAmount;
    private String loanPurpose;
    private LoanType loanType;
    private int tenureInMonths;
}
