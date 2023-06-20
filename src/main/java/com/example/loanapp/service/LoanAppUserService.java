package service;

import data.model.Loan;
import data.model.User;
import data.repositories.LoanRepository;
import data.repositories.UserRepository;
import dto.request.LoanApplicationRequest;
import dto.request.LoginRequest;
import dto.request.RegistrationRequest;
import dto.response.LoanApplicationResponse;
import dto.response.LoginResponse;
import dto.response.RegistrationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.Mapper;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class LoanAppUserService implements UserService{

    private final UserRepository userRepository;

    @Autowired
    private final LoanRepository loanRepository;



    @Override
    public RegistrationResponse register(RegistrationRequest registrationRequest) {
        User newUser = Mapper.map(registrationRequest);
        User savedUser = userRepository.save(newUser);
        return Mapper.map(savedUser);
    }

    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        User foundUser = userRepository.findByPhoneNumber(loginRequest.getPhoneNumber());
        if (Objects.equals(foundUser.getPassword(), loginRequest.getPassword())){
            LoginResponse response = new LoginResponse();
            response.setFoundUser(foundUser);
            return response;
        }
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
