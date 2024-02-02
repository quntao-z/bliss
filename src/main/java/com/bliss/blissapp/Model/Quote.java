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
    private String q; // Quote text
    private String a; // Author
    private String c; // Character count
    private String h; // HTML representation

    public Quote(String q, String a, String c, String h) {
        this.q = q;
        this.a = a;
        this.c = c;
        this.h = h;
    }

}