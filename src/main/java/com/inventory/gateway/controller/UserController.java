package com.inventory.gateway.controller;

import java.io.IOException;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.gateway.dto.UserInfo;

import jakarta.servlet.http.HttpServletResponse;

@CrossOrigin(origins = "*")
@RestController
public class UserController {

    @GetMapping("/")
    public void user(HttpServletResponse response) throws IOException {
        response.sendRedirect("http://localhost:4000/home");
    }
    
    @GetMapping("/api/userinfo")
    public UserInfo getUserInfo(@AuthenticationPrincipal OAuth2User principal) {
        UserInfo userInfo = new UserInfo();
        if (principal != null) {
            // Assuming the user's name and email are stored under these keys
            userInfo.setName(principal.getAttribute("name"));
            userInfo.setEmail(principal.getAttribute("email"));
            userInfo.setGoogleId(principal.getAttribute("sub"));
        }
        return userInfo;
    }
}