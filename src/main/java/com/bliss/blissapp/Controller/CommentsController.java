package com.bliss.blissapp.Controller;

import com.bliss.blissapp.Model.Comments;
import com.bliss.blissapp.Service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/Comments")
@RestController
public class CommentsController {
    private CommentsService commentsService;

    @Autowired
    public CommentsController(CommentsService commentsService){
        this.commentsService = commentsService;
    }

    @PostMapping("/")
    public void createComment(Comments comment){
        commentsService.createComment(comment);
    }

    @GetMapping("/{id}")
    public Optional<Comments> getCommentById(@PathVariable Long id){
        return commentsService.getCommentById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCommentById(Long id) {
        commentsService.deleteCommentById(id);
    }

}
