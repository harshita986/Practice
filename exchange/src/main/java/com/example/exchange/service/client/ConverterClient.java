package com.example.exchange.service.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name="convertor-service",url = "http://localhost:8082/converter")
public interface ConverterClient {

    @GetMapping("/convert")
    double convert(@RequestParam double amount, @RequestParam String from, @RequestParam String to);
}
