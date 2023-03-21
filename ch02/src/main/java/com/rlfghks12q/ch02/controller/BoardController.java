package com.rlfghks12q.ch02.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.HttpServerErrorException;

import com.rlfghks12q.ch02.utils.ScriptWriter;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/board")
public class BoardController {
  
  @GetMapping("/write")
  public String write() {
    return "/board/write";
  }

  @GetMapping("/writeProcess")
  public void writeProcess(
    String userId, 
    String userPw,
    HttpServletResponse response 
    ) throws IOException {
      if(userId.equals("rlfghks12q") && userPw.equals("1234"))  {
        ScriptWriter.alertAndNext(response, "로그인 되었습니다.","/");
      } else {
        ScriptWriter.alertAndBack(response, "서버 오류.");
      }
    }

  @GetMapping("/view")
  public String view() {
    return "/board/view";
  }
}
