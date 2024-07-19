package com.bigfishgames.wishlist.Entity;

import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.Id;

public class Wish {
    @Id
    private String id;

    public String uid;

    public String bookId;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, Object> getData() {
        Map<String, Object> data = new HashMap<>();

        data.put("id", this.getId());
        // data.put("uid", this.getUid());
        // data.put("bookId", this.getBookId());

        return data;
    }

    // ...
}
