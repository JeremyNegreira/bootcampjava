package com.bootcampjava.C02E3.controllers;

import com.bootcampjava.C02E3.services.APIMorse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseController {
    
    @GetMapping("/")
    public String traducirOracionAMorse(@RequestParam String oracion) {
        return APIMorse.traducirOracionAMorse(oracion);
    }
}
