package com.example.sentinel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 阮威敏
 * @since 2023.05.30
 */
@RequestMapping("/sentinel")
@RestController
public class SentinelController {

    @GetMapping("/demo")
    public String demo() {
        return "demo";
    }
}
