package com.bigfishgames.wishlist.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigfishgames.wishlist.Entity.Wish;
import com.bigfishgames.wishlist.Repository.WishRepository;

@Service
public class WishService {
    @Autowired
    private WishRepository wishRepository;

    public WishRepository getRepository() {
        return this.wishRepository;
    }

    public Wish insert(Wish wish) {
        return this.getRepository().save(wish);
    }

}
