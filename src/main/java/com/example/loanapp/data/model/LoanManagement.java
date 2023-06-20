package data.model;

import data.Enums.LoanStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@NoArgsConstructor
@Document
@AllArgsConstructor
@Data
public class LoanManagement {
    @Id
    private String id;

    private LoanStatus loanApplicationStatus;
    private User user;
    private Loan loan;
    private LocalDateTime dateTime;
    private LoanOfficer loanOfficer;
}
