package com.bootcampjava.C02E2.controllers;

import com.bootcampjava.C02E2.services.APIMorse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseController {
    
    @GetMapping("/")
    public String traducirPalabraAMorse(@RequestParam String palabra) {
        return APIMorse.traducirPalabraAMorse(palabra);
    }
}
