package com.example.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.application.service.userApplicationService;

@Controller
@RequestMapping("/user")
public class SignupController {
  @Autowired
  private userApplicationService userApplicationService;

  @GetMapping("/signup")
  // ユーザー登録画面の表示
  public String getSignup(Model model) {
    //性別を取得
    Map<String, Integer>genderMap = userApplicationService.getGenderMap();
    model.addAttribute("genderMap",genderMap);
    
    return "user/signup";
  }
}
