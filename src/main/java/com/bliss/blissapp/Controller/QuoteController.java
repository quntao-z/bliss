package com.bliss.blissapp.Controller;

import com.bliss.blissapp.Model.Quote;
import com.bliss.blissapp.Repository.QuoteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/quote")
public class QuoteController {
    private final QuoteRepository quoteRepository;

    public QuoteController(QuoteRepository quoteRepository){
        this.quoteRepository = quoteRepository;
    }

    @GetMapping("/all")
    public List<Quote> getAllQuotes(){
        return quoteRepository.findAll();
    }

    @GetMapping("/id")
    public Optional<Quote> getQuoteById(@PathVariable Long id){
        return quoteRepository.findById(id);
    }



}
