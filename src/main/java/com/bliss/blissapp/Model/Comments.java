package com.bliss.blissapp.Model;

import org.springframework.data.annotation.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Getter
@Setter
@Document(collection = "comments")
public class Comments {
    @Id
    private Long Id;
    private String text;
    private User author;
    private LocalDateTime dateTime;
}
