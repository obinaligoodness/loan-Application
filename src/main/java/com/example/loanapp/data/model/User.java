package com.example.loanapp.data.model;



import com.example.loanapp.data.Enums.EmploymentClassification;
import com.example.loanapp.data.Enums.EmploymentStatus;
import com.example.loanapp.data.Enums.Sex;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;
    @Id
    private String id;
    private Sex sex;
    private EmploymentStatus employmentStatus;
    private EmploymentClassification employmentClassification;
    private String nameOfCurrentEmployer;
    private BigDecimal basicMonthSalary;
    private String password;
}
