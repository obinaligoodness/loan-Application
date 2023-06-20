package utils;

import data.model.Loan;
import data.model.User;
import dto.request.LoanApplicationRequest;
import dto.request.RegistrationRequest;
import dto.response.LoanApplicationResponse;
import dto.response.RegistrationResponse;

public class Mapper {

    public static User map(RegistrationRequest registrationRequest){
        User newUser = new User();
        newUser.setAddress(registrationRequest.getAddress());
        newUser.setEmail(registrationRequest.getEmail());
        newUser.setFirstName(registrationRequest.getFirstName());
        newUser.setLastName(registrationRequest.getLastName());
        newUser.setEmploymentStatus(registrationRequest.getEmploymentStatus());
        newUser.setPhoneNumber(registrationRequest.getPhoneNumber());
        newUser.setSex(registrationRequest.getSex());
        newUser.setBasicMonthSalary(registrationRequest.getBasicMonthSalary());
        newUser.setEmploymentClassification(registrationRequest.getEmploymentClassification());
        newUser.setNameOfCurrentEmployer(registrationRequest.getNameOfCurrentEmployer());
        newUser.setPassword(registrationRequest.getPassword());
        return newUser;
    }

    public static RegistrationResponse map(User savedUser){
        RegistrationResponse response = new RegistrationResponse();
        response.setMessage("Registration Successful");
        return response;
    }

    public static Loan map(LoanApplicationRequest loanApplicationRequest){
        Loan newLoan = new Loan();
        newLoan.setLoanAmount(loanApplicationRequest.getLoanAmount());
        newLoan.setLoanType(loanApplicationRequest.getLoanType());
        newLoan.setLoanPurpose(loanApplicationRequest.getLoanPurpose());
        newLoan.setTenureInMonths(loanApplicationRequest.getTenureInWeeks());
        return newLoan;
    }

    public static LoanApplicationResponse map(Loan savedLoan){
        LoanApplicationResponse response = new LoanApplicationResponse();
        response.setLoanAmount(savedLoan.getLoanAmount());
        response.setLoanPurpose(savedLoan.getLoanPurpose());
        response.setLoanType(savedLoan.getLoanType());
        response.setTenureInMonths(savedLoan.getTenureInMonths());

        return response;
    }

}
