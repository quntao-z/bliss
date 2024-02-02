package com.bliss.blissapp.Controller;

import com.bliss.blissapp.Model.Comments;
import com.bliss.blissapp.Model.Posts;
import com.bliss.blissapp.Service.CommentsService;
import com.bliss.blissapp.Service.NextSequenceService;
import com.bliss.blissapp.Service.PostService;
import org.checkerframework.checker.units.qual.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.stream.events.Comment;
import java.util.List;
import java.util.Optional;

@RequestMapping("/comments")
@RestController
@CrossOrigin
public class CommentsController {
    private CommentsService commentsService;
    private final NextSequenceService nextSequenceService;

    @Autowired
    public CommentsController(CommentsService commentsService, NextSequenceService nextSequenceService){
        this.commentsService = commentsService;
        this.nextSequenceService = nextSequenceService;
    }

    @PostMapping("/")
    public void createComment(@RequestBody Comments comment){
        comment.setId(nextSequenceService.getNextSequence("customSequences"));
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
