package com.bliss.blissapp.Controller;

import com.bliss.blissapp.Model.AuthenticationRequest;
import com.bliss.blissapp.Model.AuthenticationResponse;
import com.bliss.blissapp.Model.RegisterRequest;
import com.bliss.blissapp.Service.AuthenticationService;
import jdk.jfr.Registered;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(this.authenticationService.register(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody AuthenticationRequest request) {
        return ResponseEntity.ok(this.authenticationService.authenticate(request));
    }

}
