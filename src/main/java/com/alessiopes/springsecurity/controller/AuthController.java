package com.alessiopes.springsecurity.controller;

import com.alessiopes.springsecurity.dto.JwtAuthResponse;
import com.alessiopes.springsecurity.dto.SignInRequest;
import com.alessiopes.springsecurity.dto.SignUpRequest;
import com.alessiopes.springsecurity.entities.User;
import com.alessiopes.springsecurity.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping(path = "/signup")
    public ResponseEntity<User> signup(@RequestBody SignUpRequest signUpRequest) {
        return ResponseEntity.ok(authService.signUp(signUpRequest));
    }

    @PostMapping(path = "/signin")
    public ResponseEntity<JwtAuthResponse> signin(@RequestBody SignInRequest signInRequest) {
        return ResponseEntity.ok(authService.signIn(signInRequest));
    }

}
