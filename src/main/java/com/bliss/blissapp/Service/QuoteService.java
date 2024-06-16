package com.bliss.blissapp.Service;

import com.bliss.blissapp.Model.Quote;
import com.bliss.blissapp.Repository.QuoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class QuoteService {
    private final QuoteRepository quoteRepository;

    public List<Quote> getAllQuotes(){
        return quoteRepository.findAll();
    }

    public void createQuote(Quote quote) {
        quoteRepository.save(quote);
    }

    public Optional<Quote> getQuoteById(@PathVariable Long id){
        return quoteRepository.findById(id);
    }
}
