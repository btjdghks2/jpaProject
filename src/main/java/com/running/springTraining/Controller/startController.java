package com.running.springTraining.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class startController {

    @GetMapping("/")
    public String home() {
        return "startV2";
    }
}
