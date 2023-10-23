package com.bliss.blissapp.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
@Table(name = "quote")
public class Quote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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