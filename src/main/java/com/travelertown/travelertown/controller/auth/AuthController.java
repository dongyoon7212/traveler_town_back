package com.travelertown.travelertown.controller.auth;

import com.travelertown.travelertown.aop.annotation.ValidAspect;
import com.travelertown.travelertown.dto.auth.SigninReqDto;
import com.travelertown.travelertown.dto.auth.SignupReqDto;
import com.travelertown.travelertown.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @ValidAspect
    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody SignupReqDto signupReqDto, BindingResult bindingResult) {
        System.out.println(signupReqDto);
        authService.signup(signupReqDto);
        return ResponseEntity.created(null).body(true);
    }

    @PostMapping("/signin")
    public ResponseEntity<?> signin(@RequestBody SigninReqDto signinReqDto) {
        System.out.println(signinReqDto);
        return ResponseEntity.ok(authService.signin(signinReqDto));
    }
}
