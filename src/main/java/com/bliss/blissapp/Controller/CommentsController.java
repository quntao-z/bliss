package com.bliss.blissapp.Controller;

import com.bliss.blissapp.Model.Comments;
import com.bliss.blissapp.Model.Posts;
import com.bliss.blissapp.Service.CommentsService;
import com.bliss.blissapp.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/Comments")
@RestController
public class CommentsController {
    private CommentsService commentsService;
    private final PostService postService;

    @Autowired
    public CommentsController(CommentsService commentsService, PostService postService){
        this.commentsService = commentsService;
        this.postService = postService;
    }

    @PostMapping("/")
    public void createComment(Comments comment){
        commentsService.createComment(comment);
    }

    @GetMapping("/{id}")
    public Optional<Comments> getCommentById(@PathVariable Long id){
        return commentsService.getCommentById(id);
    }

    @GetMapping("/by-post/{postId}")
    public List<Comments> findCommentsByPost(@PathVariable Long postId){
        Optional<Posts> post = postService.getPostById(postId);
        return commentsService.getCommentByPost(post);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCommentById(Long id) {
        commentsService.deleteCommentById(id);
    }

}
