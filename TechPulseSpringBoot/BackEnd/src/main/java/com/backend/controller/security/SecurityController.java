package com.backend.controller.security;

import com.backend.model.account.Account;
import com.backend.payload.request.SignInForm;
import com.backend.payload.response.JwtRespone;
import com.backend.payload.response.MessageRespone;
import com.backend.payload.response.UserInfomartion;
import com.backend.security.jwt.JwtProvider;
import com.backend.security.user_detail.MyUserDetail;
import com.backend.service.account.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/v1/security")
public class SecurityController {
    @Autowired
    private IAccountService accountService;

    @Autowired
    private JwtProvider jwtProvider;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody SignInForm signInForm) {

        Account accountValidate = accountService.findAccountByUserName(signInForm.getUsername());

        if (accountValidate == null) {
            return new ResponseEntity<>(new MessageRespone("username not found"), HttpStatus.NOT_FOUND);
        }

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(signInForm.getUsername(), signInForm.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String token = jwtProvider.createToken(authentication);

        MyUserDetail myUserDetail = (MyUserDetail) authentication.getPrincipal();

        UserInfomartion userInfomartion = new UserInfomartion();
        userInfomartion.setUsername(myUserDetail.getAccount().getUsername());
        userInfomartion.setAvatar(myUserDetail.getAccount().getUser().getAvatar());
        userInfomartion.setLastName(myUserDetail.getAccount().getUser().getLastName());
        userInfomartion.setUserId(String.valueOf(myUserDetail.getAccount().getUser().getId()));

        return ResponseEntity.ok(new JwtRespone(token,
                userInfomartion,
                myUserDetail.getAuthorities()));
    }
}
