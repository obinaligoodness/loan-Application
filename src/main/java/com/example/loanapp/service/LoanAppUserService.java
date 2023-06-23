package com.example.loanapp.service;


import com.example.loanapp.LoanAppApplication;
import com.example.loanapp.data.model.Loan;
import com.example.loanapp.data.model.User;
import com.example.loanapp.data.repositories.LoanRepository;
import com.example.loanapp.data.repositories.UserRepository;
import com.example.loanapp.dto.request.LoanApplicationRequest;
import com.example.loanapp.dto.request.LoginRequest;
import com.example.loanapp.dto.request.RegistrationRequest;
import com.example.loanapp.dto.response.LoanApplicationResponse;
import com.example.loanapp.dto.response.LoginResponse;
import com.example.loanapp.dto.response.RegistrationResponse;
import com.example.loanapp.utils.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;


@Service
@RequiredArgsConstructor
public class LoanAppUserService implements UserService{

    private final UserRepository userRepository;
    private final LoanRepository loanRepository;
    private final LoanAppApplication loanAppApplication;



    @Override
    public RegistrationResponse register(RegistrationRequest registrationRequest) {
        User newUser = Mapper.map(registrationRequest);
        User savedUser = userRepository.save(newUser);
        return Mapper.map(savedUser);
    }

    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        return null;
    }

    @Override
    public LoanApplicationResponse applyForLoan(LoanApplicationRequest loanApplicationRequest) {
        Loan newLoan = Mapper.map(loanApplicationRequest);
        Loan savedLoan = loanRepository.save(newLoan);
        return Mapper.map(savedLoan);
    }


    @Override
    public String viewLoanApplicationStatus() {
        return null;
    }

    @Override
    public String viewLoanAgreement() {
        return null;
    }
}
