package com.bliss.blissapp.Service;

import com.bliss.blissapp.Model.Posts;
import com.bliss.blissapp.Repository.PostsRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class PostService {
    private PostsRepository postsRepository;

    public PostService(PostsRepository postsRepository){
        this.postsRepository = postsRepository;
    }

    public List<Posts> getAllPosts(){
        return postsRepository.findAll();
    }

    public void createPost(Posts post){
        postsRepository.save(post);
    }

}
