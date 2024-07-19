package com.bigfishgames.wishlist.Entity;

import org.springframework.data.annotation.Id;

public class User {
    @Id
    private String id;

    public String email;

    public String password;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
