package com.example.loanapp.service;


import com.example.loanapp.dto.request.LoanApplicationRequest;
import com.example.loanapp.dto.request.LoginRequest;
import com.example.loanapp.dto.request.RegistrationRequest;
import com.example.loanapp.dto.response.LoanApplicationResponse;
import com.example.loanapp.dto.response.LoginResponse;
import com.example.loanapp.dto.response.RegistrationResponse;

public interface UserService {
    RegistrationResponse register(RegistrationRequest registrationRequest);
    LoginResponse login(LoginRequest loginRequest);
    LoanApplicationResponse applyForLoan(LoanApplicationRequest loanApplicationRequest);
    String viewLoanApplicationStatus();
    String viewLoanAgreement();
}

