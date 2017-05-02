package com.example.wildcat.mad_vureserve;

/**
 * Created by wildcat on 4/10/2017.
 */
public class User {
    int id;
    String username, email, name, password;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

    // Username
    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return this.username;
    }

    // Email Address
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }

    // Name (proper)
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    // Password
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword() {
        return this.password;
    }

}
