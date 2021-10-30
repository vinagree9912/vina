package vina.vina.controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<String> helloReact(){

        String helloReact="Hello react by nico " + new Date();

        return new ResponseEntity<String>(helloReact,new HttpHeaders(), HttpStatus.OK);
    }

}
