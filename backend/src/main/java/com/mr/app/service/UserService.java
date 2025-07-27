package com.mr.app.service;

import com.mr.app.dto.UserLoginRequest;
import com.mr.app.dto.UserLoginResponse;
import com.mr.app.dto.UserSignupRequest;

public interface UserService {
    void signup(UserSignupRequest request);
    UserLoginResponse login(UserLoginRequest request);
}