package com.bliss.blissapp.Service;

import com.bliss.blissapp.Model.Comments;
import com.bliss.blissapp.Model.Posts;
import com.bliss.blissapp.Repository.PostsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Posts> getPostById(Long id){
        return postsRepository.findById(id);
    }


}
