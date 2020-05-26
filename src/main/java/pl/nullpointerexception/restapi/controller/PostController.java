package pl.nullpointerexception.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.nullpointerexception.restapi.model.Post;

import java.util.List;

@RestController
public class PostController {

    @GetMapping("/posts")
    public List<Post> getPosts() {
    throw new IllegalArgumentException("Not imported yet");

    }

    @GetMapping("/post")
    public Post getSinglePost() {
        throw new IllegalArgumentException("Not imported yet");

    }

}
