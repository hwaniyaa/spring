package com.rlfghks12q.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("/home")
  public String home(){
    return "home"; // View page
  }

  @GetMapping("/introduce")
  public String introduce(){
    return "introduce";
  }
}
