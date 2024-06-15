package com.bliss.blissapp.Controller;
import com.bliss.blissapp.Model.Quote;
import com.bliss.blissapp.Service.QuoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/quotes")
@CrossOrigin
public class QuoteController {
    private final QuoteService quoteService;

    @GetMapping("/all")
    public List<Quote> getAllQuotes(){
        return quoteService.getAllQuotes();
    }

    @GetMapping("/{id}")
    public Optional<Quote> getQuoteById(@PathVariable Long id){
        return quoteService.getQuoteById(id);
    }


}
