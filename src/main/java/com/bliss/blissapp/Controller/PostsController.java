package com.bliss.blissapp.Controller;

import com.bliss.blissapp.Model.Location;
import com.bliss.blissapp.Model.Posts;
import com.bliss.blissapp.Service.PostService;
import com.bliss.blissapp.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
@CrossOrigin
public class PostsController {
    private final PostService postService;
    private final UserService userService;

    @GetMapping("/all")
    public List<Posts> getAllPosts(){
        return this.postService.getAllPosts();
    }

    @GetMapping("/posts-nearby")
    public List<Posts> getPostsByUserNearby(@RequestBody Location location){
        return this.postService.getPostsByUserNearby(location);
    }

    @PostMapping("/")
    public void createPost(@RequestBody Posts post){
        post.setId(UUID.randomUUID());
        this.postService.createPost(post);
    }

}
