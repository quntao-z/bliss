package com.bliss.blissapp.Service;

import com.bliss.blissapp.Model.Quote;
import com.bliss.blissapp.Repository.QuoteRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class QuoteService {
    private QuoteRepository quoteRepository;

    public QuoteService(QuoteRepository quoteRepository){
        this.quoteRepository = quoteRepository;
    }
    public List<Quote> getAllQuotes(){
        return quoteRepository.findAll();
    }

    public Optional<Quote> getQuoteById(@PathVariable Long id){
        return quoteRepository.findById(id);
    }



}
