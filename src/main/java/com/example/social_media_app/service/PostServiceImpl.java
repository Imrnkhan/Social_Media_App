package com.example.social_media_app.service;

import com.example.social_media_app.Model.Post;
import com.example.social_media_app.excepction.PostException;
import com.example.social_media_app.reposistory.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostServiceImpl implements PostService{


@Autowired
    private PostRepository postRepository;




    @Override
    public Post savepost(Post post) {
        return postRepository.save(post);           // save the post
    }

    //post all list

    @Override
    public List<Post> getAllpost() throws PostException {
        List<Post> postes = postRepository.findAll();
        if(postes.size()>0)
            return postes;
        else
            throw new PostException("No post found...");
    }


//delete post with id

    @Override
    public Post deletePost(Integer id) throws PostException {
        Post existingPost = postRepository.findById(id).orElseThrow( () -> new PostException("Student does not exist with Roll :"+id) );
        postRepository.delete(existingPost);

        return existingPost;
    }
}
