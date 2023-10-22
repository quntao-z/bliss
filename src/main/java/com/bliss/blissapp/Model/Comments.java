package com.bliss.blissapp.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
@Table(name = "user_comments")
public class Comments {
    @Id
    private Long Id;
    @Column(columnDefinition = "TEXT")
    private String text;
    private String author;
    private LocalDateTime dateTime;
}