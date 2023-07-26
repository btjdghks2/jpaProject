package com.running.springTraining.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainPageController {

    @GetMapping("/api/mainpage")
    public String mainpage() {
        return "";
    }
}
