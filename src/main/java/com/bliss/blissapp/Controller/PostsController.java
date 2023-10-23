package com.bliss.blissapp.Controller;

import com.bliss.blissapp.Model.Posts;
import com.bliss.blissapp.Service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostsController {
    private PostService postService;
    public PostsController(PostService postService){
        this.postService = postService;
    }

    @GetMapping("/all")
    public List<Posts> getAllPosts(){
        return postService.getAllPosts();
    }

    @PostMapping("/")
    public void createPost(@RequestBody Posts post){
        postService.createPost(post);
    }

}
