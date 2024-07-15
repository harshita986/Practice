package com.example.convertor.controller;

import com.example.convertor.service.ConvertorService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/convertor")
public class ConvertorController {

    @Autowired
    private ConvertorService convertorService;


    @GetMapping("/convert")
    public double convert( @RequestParam double amount , @RequestParam String from, @RequestParam String to) {
        return convertorService.convert(amount,from,to);

    }
}
