package service;

import data.model.LoanManagement;

import java.util.List;

public interface LoanOfficerService {
    Login login(String name, String password);
    List<LoanManagement> viewLoanApplications();
    void reviewLoanApplication(String loanApplicationId);
    void reviewLoanApplicationStatus(LoanManagement loanApplication);
    

}
