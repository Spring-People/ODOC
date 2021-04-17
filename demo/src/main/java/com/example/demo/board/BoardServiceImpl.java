package com.example.demo.board;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BoardServiceImpl implements BoardService{

    private final BoardRepo boardRepo;

    @Autowired
    public BoardServiceImpl(BoardRepo boardRepo){
        this.boardRepo = boardRepo;
    }

    @Override
    public List<Post> findAll() {
        return boardRepo.findAll();
    }

    @Override
    public List<Post> findPostByTitle(String title) {
        return boardRepo.findByTitle(title);
    }

    @Override
    public void insertPost(Post post) {
        boardRepo.savePost(post);
    }
}
