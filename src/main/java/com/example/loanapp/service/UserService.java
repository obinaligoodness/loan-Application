package service;

import dto.request.LoanApplicationRequest;
import dto.request.LoginRequest;
import dto.request.RegistrationRequest;
import dto.response.LoanApplicationResponse;
import dto.response.LoginResponse;
import dto.response.RegistrationResponse;

public interface UserService {
    RegistrationResponse register(RegistrationRequest registrationRequest);
    LoginResponse login(LoginRequest loginRequest);
    LoanApplicationResponse applyForLoan(LoanApplicationRequest loanApplicationRequest);
    String viewLoanApplicationStatus();
    String viewLoanAgreement();
}
