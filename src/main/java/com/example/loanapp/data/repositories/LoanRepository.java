package com.example.loanapp.data.repositories;

import com.example.loanapp.data.model.Loan;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoanRepository extends MongoRepository<Loan, String> {
}
