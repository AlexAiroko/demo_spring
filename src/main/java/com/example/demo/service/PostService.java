package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("Post 1", new Date(2026, 2, 9)));
        posts.add(new Post("Important Post", new Date(2026, 2, 10)));
        posts.add(new Post("Very Important Post", new Date(2026, 2, 8)));
        return posts;
    }
}
