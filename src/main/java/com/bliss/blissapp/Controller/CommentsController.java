package com.bliss.blissapp.Controller;

import com.bliss.blissapp.Model.Comments;
import com.bliss.blissapp.Model.Posts;
import com.bliss.blissapp.Service.CommentsService;
import com.bliss.blissapp.Service.PostService;
import lombok.RequiredArgsConstructor;
import org.checkerframework.checker.units.qual.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.stream.events.Comment;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("/comments")
@RestController
@RequiredArgsConstructor
@CrossOrigin
public class CommentsController {
    private final CommentsService commentsService;

    @PostMapping("/")
    public void createComment(@RequestBody Comments comment){
        comment.setId(UUID.randomUUID());
        commentsService.createComment(comment);
    }

    @GetMapping("/{id}")
    public Optional<Comments> getCommentById(@PathVariable Long id){
        return commentsService.getCommentById(id);
    }

    @GetMapping("/by-postId/{postId}")
    public List<Comments> findCommentsByPostId(@PathVariable Long postId) {
        return commentsService.getAllCommentsByPostId(postId);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCommentById(Long id) {
        commentsService.deleteCommentById(id);
    }
}
