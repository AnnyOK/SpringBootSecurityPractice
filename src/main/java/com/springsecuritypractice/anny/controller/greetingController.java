package com.springsecuritypractice.anny.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class greetingController {
    @GetMapping
    public ResponseEntity<String> sayHello (){
        return ResponseEntity.ok("Hello from spring security new");
    }
    @GetMapping("/bye")
    public ResponseEntity<String> sayGoodby(){
        return ResponseEntity.ok("Good by  from me");
    }
}
