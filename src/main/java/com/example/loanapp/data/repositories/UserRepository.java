package com.example.loanapp.data.repositories;

import com.example.loanapp.data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
