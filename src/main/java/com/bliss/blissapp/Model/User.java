package com.bliss.blissapp.Model;

import jakarta.annotation.Generated;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;

@RequiredArgsConstructor
@Getter
@Setter
@Document(collection = "users")
public class User {
    @Id
    private Long id;
    private String name;

}
