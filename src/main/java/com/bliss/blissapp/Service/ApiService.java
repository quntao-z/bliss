package com.bliss.blissapp.Service;

import com.bliss.blissapp.Model.Quote;
import com.bliss.blissapp.Repository.QuoteRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiService {
    private final QuoteRepository quoteRepository;
    private final RestTemplate restTemplate;

    public ApiService(QuoteRepository quoteRepository, RestTemplate restTemplate) {
        this.quoteRepository = quoteRepository;
        this.restTemplate = restTemplate;
    }

    @PostConstruct
    public void fetchDataAndSaveToDB() {
        String url = "https://zenquotes.io/api/quotes";

        Quote[] quotes = restTemplate.getForObject(url, Quote[].class);
        for (Quote quote : quotes) {
            quoteRepository.save(quote);
        }
    }
}
