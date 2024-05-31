package com.bliss.blissapp.Service;

import com.bliss.blissapp.Model.Comments;
import com.bliss.blissapp.Model.Posts;
import com.bliss.blissapp.Repository.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

@Service
public class CommentsService {
    @Autowired
    private MongoTemplate mongoTemplate;
    private final CommentsRepository commentsRepository;

    public CommentsService(CommentsRepository commentsRepository) {
        this.commentsRepository = commentsRepository;
    }

    public Optional<Comments> getCommentById(Long id) {
        return commentsRepository.findById(id);

    }

    public void createComment(Comments comment){
        commentsRepository.save(comment);
    }

    public void deleteCommentById(Long id){
        commentsRepository.deleteById(id);
    }

    public List<Comments> getAllCommentsByPostId(Long postId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("postId").is(postId));
        return mongoTemplate.find(query, Comments.class);
    }
}
