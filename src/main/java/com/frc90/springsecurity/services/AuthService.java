package com.frc90.springsecurity.services;

import com.frc90.springsecurity.controllers.models.AuthResponse;
import com.frc90.springsecurity.controllers.models.AuthenticationRequest;
import com.frc90.springsecurity.controllers.models.RegisterRequest;

public interface AuthService {
    AuthResponse register(RegisterRequest request);
    AuthResponse authenticate(AuthenticationRequest request);
}
