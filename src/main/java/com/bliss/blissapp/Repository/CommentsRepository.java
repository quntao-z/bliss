package com.bliss.blissapp.Repository;

import com.bliss.blissapp.Model.Comments;
import com.bliss.blissapp.Model.Posts;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CommentsRepository extends MongoRepository<Comments, Long> {
}
