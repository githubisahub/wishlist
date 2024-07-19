package com.bigfishgames.wishlist.Entity;

import org.springframework.data.annotation.Id;

public class Book {
    @Id
    private String id;

    public String title;

    public String serialNumber;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // ....
}
