package com.example.convertor.service;


import org.springframework.stereotype.Service;

@Service
public class ConvertorService {
    public double convert(double amount, String from, String to) {
        double rate = getExchangeRate(from, to);
        return amount * rate;
    }

    private double getExchangeRate(String from, String to) {
        // Mocked exchange rates for demonstration
        if ("INR".equals(from) && "USD".equals(to)) {
            return 0.013; // 1 INR = 0.013 USD
        } else if ("USD".equals(from) && "INR".equals(to)) {
            return 74.85; // 1 USD = 74.85 INR
        }
        // Add more exchange rates as needed
        return 1.0;
    }
}
