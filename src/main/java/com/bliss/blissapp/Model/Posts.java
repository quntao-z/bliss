package com.bliss.blissapp.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
@Table(name = "Posts")
public class Posts {
    @Id
    private Long id;
    @ManyToOne
    private User author;
    @Column(columnDefinition = "TEXT")
    private String text;
}