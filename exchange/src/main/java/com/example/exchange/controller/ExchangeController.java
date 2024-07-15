package com.example.exchange.controller;

import com.example.exchange.service.IExchangeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class ExchangeController {

    private final IExchangeService iexchangeService;

    @GetMapping("/getExchange")
    public ResponseEntity<Double> fetchAccount(@RequestParam double amount, @RequestParam String from, @RequestParam String to) {
        double finalAmount = iexchangeService.getFinalExchange(amount,from,to);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(finalAmount);
    }

}
