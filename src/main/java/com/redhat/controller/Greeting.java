package com.redhat.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Greeting {
  @GetMapping(value="/")
  public String getMethodName() {
      return "Hello World";
  }
}