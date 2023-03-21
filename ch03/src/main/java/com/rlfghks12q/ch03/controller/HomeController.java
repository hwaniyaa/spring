package com.rlfghks12q.ch03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {
  
  @GetMapping("/")
  public String home(){
    return "/index/index";
  }
  @GetMapping("/test")
  public String test(){
    return "/index/index2";
  }
}
