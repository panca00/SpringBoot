package com.digitalionovationone.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * HelloController
 */
@RestController

    public class HelloController {
        @GetMapping("/")
        public String helloMenssage(){
            return "Hello,Digital Inovvation One";
        }
    }
