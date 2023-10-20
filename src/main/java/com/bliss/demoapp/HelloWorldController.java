package com.bliss.demoapp;

import com.fasterxml.jackson.databind.JsonNode;
import org.slf4j.ILoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping(value = "/quote")
    public List<Object> getRandomQuote() {
        String url = "https://zenquotes.io/api/quotes";
        RestTemplate restTemplate = new RestTemplate();

        JsonNode quotes = restTemplate.getForObject(url, JsonNode.class);

        List<JsonNode> qz = Collections.singletonList(quotes);

        System.out.println(qz.get(0));

        return Collections.singletonList(qz);
    }

}
