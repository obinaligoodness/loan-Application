package com.example.loanapp.data.repositories;

import com.example.loanapp.data.model.LoanManagement;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoanApplicationRepository extends MongoRepository <LoanManagement, String> {
}
