package com.afr.spring.boot.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
  
  @GetMapping
  public String helloWorld() {
    return "HELLO mf WORLD!!!";
  }


}
