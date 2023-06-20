package com.example.loanapp.dto.request;


import com.example.loanapp.data.Enums.EmploymentClassification;
import com.example.loanapp.data.Enums.EmploymentStatus;
import com.example.loanapp.data.Enums.Sex;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class RegistrationRequest {
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;
    private Sex sex;
    private EmploymentStatus employmentStatus;
    private EmploymentClassification employmentClassification;
    private String nameOfCurrentEmployer;
    private BigDecimal basicMonthSalary;
    private String password;
}
