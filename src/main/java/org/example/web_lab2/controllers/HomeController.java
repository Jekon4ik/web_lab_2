package org.example.web_lab2.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("say-my-name/")
    public String sayMyName() {
        return "Yevhenii Savratskyi, KP-22";
    }
}
