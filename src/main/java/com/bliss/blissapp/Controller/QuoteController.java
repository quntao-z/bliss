package com.bliss.blissapp.Controller;

import com.bliss.blissapp.Model.Quote;
import com.bliss.blissapp.Service.QuoteService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/quote")
@CrossOrigin
public class QuoteController {
    private QuoteService quoteService;

    public QuoteController(QuoteService quoteService){
        this.quoteService = quoteService;
    }

    @GetMapping("/all")
    public List<Quote> getAllQuotes(){
        return quoteService.getAllQuotes();
    }

    @GetMapping("/{id}")
    public Optional<Quote> getQuoteById(@PathVariable Long id){
        return quoteService.getQuoteById(id);
    }


}
