package com.example.loanapp.data.repositories;

import com.example.loanapp.data.model.LoanOfficer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoanOfficerRepository extends MongoRepository<LoanOfficer, String> {
}
