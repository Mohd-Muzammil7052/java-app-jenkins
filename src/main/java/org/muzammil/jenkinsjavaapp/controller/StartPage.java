package org.muzammil.jenkinsjavaapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartPage {

    @GetMapping("/")
    public String start(){
        return "Welcome to Jenkins Start Page...";
    }
}
