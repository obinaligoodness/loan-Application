package com.example.loanapp.service;


import lombok.Data;

@Data
public class Login {
    private String phoneNumber;
    private String password;
    private String userId;
}
