package com.bliss.blissapp.Model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;

@RequiredArgsConstructor
@Getter
@Setter
@Document(collection = "quotes")
public class Quote {
    @Id
    private Object id;
    private String quote;
    private String author;
}