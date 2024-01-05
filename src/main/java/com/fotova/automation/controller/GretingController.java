package com.fotova.automation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GretingController
{
    @GetMapping
    public String greeting()
    {
        return "Hello there !";
    }
}
