package com.bigfishgames.wishlist.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bigfishgames.wishlist.Entity.Wish;
import com.bigfishgames.wishlist.Service.WishService;
import com.google.gson.Gson;

@RestController
@RequestMapping(value = "/api/wishlist", produces = MediaType.APPLICATION_JSON_VALUE)
public class WishController {
    @Autowired
    private WishService wishService;

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    String save(
            @RequestBody Wish wish) {
        return this.wishService.insert(wish).getData().toString();
    }

    @PostMapping(value = "/sync", consumes = MediaType.APPLICATION_JSON_VALUE)
    String sync(
            @RequestBody List<Map<String, Object>> req) {
        List<Map<String, Object>> data = req;

        // List<Map<String, Object>> oldEntities
        // List<Map<String, Object>> newEntities

        // split old entity which include id to save and new entity which not include id to insert
        for (int i = 0; i < data.size(); i++) {
            // ...
        }

        return (new Gson()).toJson(data);
    }

}
