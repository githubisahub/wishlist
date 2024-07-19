package com.bigfishgames.wishlist.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bigfishgames.wishlist.Entity.Wish;

public interface WishRepository extends MongoRepository<Wish, String> {
    List<Wish> findByUid(String uid);
}
