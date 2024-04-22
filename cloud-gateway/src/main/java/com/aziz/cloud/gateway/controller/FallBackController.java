package com.aziz.cloud.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
  
  @GetMapping("/tweetServiceFallBack")
  public String orderServiceFallBack(){
    return "Tweet service is down";
  }

  @GetMapping("/userServiceFallBack")
  public String productServiceFallBack(){
    return "User service is down";
  }

  @GetMapping("/likeServiceFallBack")
  public String paymentServiceFallBack(){
    return "Like service is down";
  }
  
  
}
