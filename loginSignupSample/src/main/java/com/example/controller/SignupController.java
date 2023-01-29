package com.example.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.application.userApplicationService;
import com.example.config.messageConfig;

@Controller
@RequestMapping("/user")
public class SignupController {
  
  @Autowired
  private userApplicationService service;
  private messageConfig config;
  
  @GetMapping("/signup")
  public String getSignup(Model model) {
    Map<String, Integer>genderMap = service.getGenderMap();
    String title = config.getTitle();
    System.out.println(title);
    model.addAttribute("genderMap", genderMap);
    return "user/signup";
  }
  
  @PostMapping("/signup")
  public String postSignup() {
    return "redirect:/login";
  }
}
