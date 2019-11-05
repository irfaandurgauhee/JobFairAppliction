package com.elca.jobfairmanagementsystem.security;

import lombok.Data;

@Data
public class AuthToken {

    private String token;
    private String username;

    public AuthToken(){

    }

    public AuthToken(String token, String username){
        this.token = token;
        this.username = username;
    }


}
