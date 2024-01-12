package com.alessiopes.springsecurity.services;

import com.alessiopes.springsecurity.dto.JwtAuthResponse;
import com.alessiopes.springsecurity.dto.SignInRequest;
import com.alessiopes.springsecurity.dto.SignUpRequest;
import com.alessiopes.springsecurity.entities.User;

public interface AuthService {
    User signUp(SignUpRequest signUpRequest);

    JwtAuthResponse signIn(SignInRequest signInRequest);
}
