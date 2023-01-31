package com.example.controller;

import java.util.Locale;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.application.userApplicationService;
import com.example.form.SignupForm;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/user")
@Slf4j
public class SignupController {

  @Autowired
  private userApplicationService service;

  @GetMapping("/signup")
  public String getSignup(Model model, Locale locale, @ModelAttribute SignupForm form) {
    Map<String, Integer> genderMap = service.getGenderMap(locale);
    model.addAttribute("genderMap", genderMap);
    return "user/signup";
  }

  @PostMapping("/signup")
  public String postSignup(@ModelAttribute SignupForm form) {

    log.info(form.toString());

    return "redirect:/login";
  }
}
