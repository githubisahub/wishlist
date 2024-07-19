package com.bigfishgames.wishlist.Repository;

import com.bigfishgames.wishlist.Entity.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}
