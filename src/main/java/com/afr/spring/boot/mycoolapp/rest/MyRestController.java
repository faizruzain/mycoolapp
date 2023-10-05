package com.afr.spring.boot.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

  @Value("${first.name}")
  private String fName;

  @Value("${last.name}")
  private String lName;
  
  @GetMapping("/")
  public String helloWorld() {
    return "HELLO mf WORLD!!!";
  }
  
  @GetMapping("/test")
  public String test() {
    return "restart";
  }

  @GetMapping("/fname")
  public String getFirstName() {
    return this.fName;
  }

  @GetMapping("/lname")
  public String getLastName() {
    return this.lName;
  }

}
