package com.bliss.blissapp.Model;

import lombok.Data;
import org.springframework.data.annotation.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@RequiredArgsConstructor
@Getter
@Setter
@Document(collection = "posts")
public class Posts {
    @Id
    private int id;
    private String author;
    private String text;
    private String postDate;
}