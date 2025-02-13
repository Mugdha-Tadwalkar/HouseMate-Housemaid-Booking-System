package com.housemate.service;

import com.housemate.exception.SellerException;
import com.housemate.exception.UserException;
import com.housemate.request.LoginRequest;
import com.housemate.request.ResetPasswordRequest;
import com.housemate.request.SignupRequest;
import com.housemate.response.ApiResponse;
import com.housemate.response.AuthResponse;

import jakarta.mail.MessagingException;

public interface AuthService {

    void sentLoginOtp(String email) throws UserException, MessagingException;
    String createUser(SignupRequest req) throws SellerException;
    AuthResponse signin(LoginRequest req) throws SellerException;

}
