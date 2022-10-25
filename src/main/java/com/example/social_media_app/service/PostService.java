package com.example.social_media_app.service;

import com.example.social_media_app.Model.Post;
import com.example.social_media_app.excepction.PostException;

import java.util.List;

public interface PostService {
//save post
    public Post savepost(Post post);

// all post get
    public List<Post>getAllpost()throws PostException;

    //delete post
    public Post deletePost(Integer id)throws PostException;

}
