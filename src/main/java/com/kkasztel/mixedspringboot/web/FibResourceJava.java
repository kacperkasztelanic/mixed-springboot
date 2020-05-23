package com.kkasztel.mixedspringboot.web;

import com.kkasztel.mixedspringboot.service.FibService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/java/fib")
public class FibResourceJava {

    private final FibService fibService;

    @Autowired
    public FibResourceJava(FibService fibService) {
        this.fibService = fibService;
    }

    @GetMapping("/calculate")
    public int calculate(@RequestParam int n) {
        return fibService.calculateFibonacci(n);
    }
}
