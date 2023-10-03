package com.example.testRestApi.controller;

import com.example.testRestApi.service.FrequencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class FrequencyController {

    private final FrequencyService frequencyService;

    @Autowired
    public FrequencyController(FrequencyService frequencyService) {
        this.frequencyService = frequencyService;
    }

    @GetMapping("/frequency")
    public String getFrequency(@RequestBody String string) {
        return frequencyService.getFrequency(string);
    }
}
