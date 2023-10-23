package com.bliss.blissapp.Repository;

import com.bliss.blissapp.Model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
