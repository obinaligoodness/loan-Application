package data.repositories;

import data.model.LoanManagement;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoanApplicationRepository extends MongoRepository <LoanManagement, String> {
}
