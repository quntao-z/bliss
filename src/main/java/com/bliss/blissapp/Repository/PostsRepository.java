package com.bliss.blissapp.Repository;

import com.bliss.blissapp.Model.Posts;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.ListCrudRepository;
public interface PostsRepository extends MongoRepository<Posts, Long> {
}
