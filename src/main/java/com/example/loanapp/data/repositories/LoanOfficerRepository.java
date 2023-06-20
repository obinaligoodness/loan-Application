package data.repositories;

import data.model.LoanOfficer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoanOfficerRepository extends MongoRepository<LoanOfficer, String> {
}
