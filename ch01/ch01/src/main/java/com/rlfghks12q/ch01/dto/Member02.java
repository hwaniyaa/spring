package com.rlfghks12q.ch01.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Member02 {
  private String name;
  private String id;
  private String age;
}
