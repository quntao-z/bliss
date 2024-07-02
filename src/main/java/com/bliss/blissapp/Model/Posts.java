package com.bliss.blissapp.Model;
import org.springframework.data.annotation.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.UUID;

@RequiredArgsConstructor
@Getter
@Setter
@Document(collection = "posts")
public class Posts {
    @Id
    private UUID id;
    private User author;
    private String text;
    private String postDate;
}