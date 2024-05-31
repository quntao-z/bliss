package com.bliss.blissapp.Service;

import com.bliss.blissapp.Model.Quote;
import com.bliss.blissapp.Repository.QuoteRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class ApiService {
    private final QuoteRepository quoteRepository;
    private final RestTemplate restTemplate;
    private final NextSequenceService nextSequenceService;

    @PostConstruct
    public void fetchDataAndSaveToDB() {
        String url = "https://zenquotes.io/api/quotes";
        if (quoteRepository.findAll().isEmpty()) {
            Quote[] quotes = restTemplate.getForObject(url, Quote[].class);
            for (Quote quote : quotes) {
                quote.setId(nextSequenceService.getNextSequence("customSequences"));
                quoteRepository.save(quote);
            }
        }
    }
}
