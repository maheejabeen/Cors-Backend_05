package com.klu.corsbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    @GetMapping("/profile")
    public String getProfile() {
        return "Name: Mahee Jabeen | Role: Student | Department: CSE";
    }
}