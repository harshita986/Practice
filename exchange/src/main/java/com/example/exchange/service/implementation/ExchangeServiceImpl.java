package com.example.exchange.service.implementation;

import com.example.exchange.service.IExchangeService;
import com.example.exchange.service.client.ConverterClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ExchangeServiceImpl implements IExchangeService {

    private final ConverterClient converterClient;

    @Override
    public double getFinalExchange(double amount, String from, String to) {
        return converterClient.convert(amount,from,to);

    }


}
