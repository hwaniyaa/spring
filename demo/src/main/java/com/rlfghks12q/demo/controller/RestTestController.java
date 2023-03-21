package com.rlfghks12q.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rlfghks12q.demo.dto.Member;

@RestController
public class RestTestController {
  // Conteroller는 파일로 응답 jsp, html 등 파일로 리턴
  // RestControllersms body에 응답한다. (json)

  @GetMapping("/txt01")
  public String returnTxt() {
    return "hello";
  }

  @GetMapping("/json01")
  public String returnJson01() {
    return "{\"name\":\"김길환\"}";
  }

  @GetMapping("/json02")
  public HashMap<String,String> returnJson02() {
    HashMap<String,String> hashMap = new HashMap<>();
    hashMap.put("name","김길환");
    hashMap.put("weight","70");
    hashMap.put("age","30");
    return hashMap;
  }

  @GetMapping("/json03")
  public Member returnJson03() {
    Member member = new Member();
    member.setUserId("rlfghks12q");
    member.setUserName("김길환");
    member.setTel("010-1111-1111");
    member.setAddr("대갈민국");
    return member;
  }

  @GetMapping("/json04")
  public ArrayList returnJson04() {
    ArrayList<Member> arrayList = new ArrayList<>();
    Member member01 = new Member();
    member01.setUserId("rlfghks12q");
    member01.setUserName("김길환");
    member01.setAddr("대갈민국");
    
    arrayList.add(member01);

    Member member02 = new Member();
    member02.setUserId("rlfghks13q");
    member02.setUserName("김길환ㅇ");
    member02.setAddr("대갈민국");

    arrayList.add(member02);

    Member member03 = new Member();
    member03.setUserId("rlfghks13q");
    member03.setUserName("김길환ㅇ");
    member03.setAddr("대갈민국");

    arrayList.add(member03);

    return arrayList;
  }
}
