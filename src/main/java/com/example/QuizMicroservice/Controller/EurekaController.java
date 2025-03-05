package com.example.QuizMicroservice.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaController {

    @GetMapping("/actuator/info")
    public ResponseEntity<String> actuatorInfo(){
        return new ResponseEntity<>("Every Thing is working YeY its connected to eureka server" , HttpStatus.OK);
    }

}
