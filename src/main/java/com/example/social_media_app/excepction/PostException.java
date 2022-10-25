package com.example.social_media_app.excepction;

public class PostException extends RuntimeException {

    public PostException(){

    }
    public PostException(String message) {
        super(message);
    }
}
