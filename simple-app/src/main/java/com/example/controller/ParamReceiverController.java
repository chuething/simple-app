package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParamReceiverController {

    @GetMapping("/greet")
    public String greet(@RequestParam(value = "name", defaultValue = "World") String name) {
        String abc = ""; //comment new date 20250328
        return "Hello, " + name + "!";
    }

    @GetMapping("/display")
    public String displayParameters(@RequestParam java.util.Map<String, String> allParams) {
        StringBuilder sb = new StringBuilder("Received parameters:\n");
        allParams.forEach((key, value) -> sb.append(key).append(": ").append(value).append("\n"));
        return sb.toString();
    }
}