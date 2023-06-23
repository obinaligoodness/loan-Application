package com.example.loanapp.service;

import com.example.loanapp.dto.request.RegistrationRequest;
import com.example.loanapp.dto.response.RegistrationResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.example.loanapp.data.Enums.EmploymentClassification.JUNIOR_STAFF;
import static com.example.loanapp.data.Enums.Sex.MALE;
import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
class LoanAppUserServiceTest {
    @Autowired
    private UserService userService;


    @Test
    void register() {
        RegistrationRequest user = new RegistrationRequest();
        user.setAddress("5 St. Jones");
        user.setEmail("johndoe@gmail.com");
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setSex(MALE);
        user.setEmploymentClassification(JUNIOR_STAFF);
        RegistrationResponse response =  userService.register(user);

        assertEquals(user.getFirstName(), response.getFirstName());
        assertEquals("Registration Successful", response.getMessage());
    }

    @Test
    void login() {
    }

    @Test
    void applyForLoan() {
    }

    @Test
    void viewLoanApplicationStatus() {
    }

    @Test
    void viewLoanAgreement() {
    }
}