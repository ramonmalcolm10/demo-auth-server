package com.payaise.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(Model model, HttpServletRequest request) {
        String  email = (String) request.getSession()
                .getAttribute("SPRING_SECURITY_LAST_USERNAME");
        String rememberMe = (String) request.getSession()
                .getAttribute("SPRING_SECURITY_LAST_REMEMBER_ME");
        model.addAttribute("LAST_USERNAME", email);
        model.addAttribute("LAST_REMEMBER_ME", rememberMe);
        return "login";
    }

}