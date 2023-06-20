package com.example.loanapp.dto.response;


import com.example.loanapp.data.model.LoanManagement;
import com.example.loanapp.data.model.User;
import lombok.Data;

@Data
public class LoginResponse {
    private User foundUser;
    private LoanManagement application;
}
