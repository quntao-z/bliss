package com.bliss.blissapp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Quote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String q; // Quote text
    private String a; // Author
    private String c; // Character count
    private String h; // HTML representation

    // Constructors, getters, and setters

    public Quote() {
    }

    public String getC() {
        return c;
    }

    public String getH() {
        return h;
    }

    public Long getId() {
        return id;
    }

    public String getQ() {
        return q;
    }

    public String getA() {
        return a;
    }

    public Quote(String q, String a, String c, String h) {
        this.q = q;
        this.a = a;
        this.c = c;
        this.h = h;
    }


}