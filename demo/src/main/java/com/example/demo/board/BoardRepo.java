package com.example.demo.board;

import java.util.List;

public interface BoardRepo {

    void savePost(Post post);
    Post findBybno(Long bno);
    List<Post> findByTitle(String postTitle);
    List<Post> findAll();

}
