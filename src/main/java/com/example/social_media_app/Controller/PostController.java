package com.example.social_media_app.Controller;

import com.example.social_media_app.Model.Post;
import com.example.social_media_app.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

@Autowired
    private PostService postService;

//save postmapping
@PostMapping("/posts")
    public ResponseEntity<Post>savePostHandler(@RequestBody Post post){
    Post savepost = postService.savepost(post);
    return new ResponseEntity<Post>(savepost, HttpStatus.CREATED);
}

//allpost getmapping

@GetMapping("/posts")
    public ResponseEntity<List<Post>> getAllPostdetails(){
    List<Post> postess = postService.getAllpost();
    return new ResponseEntity<List<Post>>(postess,HttpStatus.OK);
}



//delete post by id

@DeleteMapping("/posts/{id}")
    public Post deletePostHendler(@PathVariable("id") Integer id){
    return postService.deletePost(id);
}

}
