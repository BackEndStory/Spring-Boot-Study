package com.example.firstproject.service;


import com.example.firstproject.data.dto.SignInResultDto;
import com.example.firstproject.data.dto.SignUpResultDto;

public interface SignService {

    SignUpResultDto signUp(String id, String password, String name, String role);
    SignInResultDto signIn(String id, String password) throws RuntimeException;
}
