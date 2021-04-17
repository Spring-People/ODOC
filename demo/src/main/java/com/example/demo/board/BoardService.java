package com.example.demo.board;

import java.util.List;

public interface BoardService {

    public List<Post> findAll();
    public List<Post> findPostByTitle(String title);
    public void insertPost(Post post);
}
