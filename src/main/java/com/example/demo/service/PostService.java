package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    private List<Post> posts = new ArrayList<>();

    public PostService() {
        posts.add(new Post(1L, "Post 1", new Date(2026, 2, 9)));
        posts.add(new Post(2L, "Important Post", new Date(2026, 2, 10)));
        posts.add(new Post(3L, "Very Important Post", new Date(2026, 2, 8)));
    }

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(Long.valueOf(posts.size() + 1), text, new Date()));
    }
}
