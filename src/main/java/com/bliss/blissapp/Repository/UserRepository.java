package com.bliss.blissapp.Repository;

import com.bliss.blissapp.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
