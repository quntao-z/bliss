package com.bliss.blissapp.Repository;

import com.bliss.blissapp.Model.Comments;
import com.bliss.blissapp.Model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface CommentsRepository extends JpaRepository<Comments, Long> {
}
