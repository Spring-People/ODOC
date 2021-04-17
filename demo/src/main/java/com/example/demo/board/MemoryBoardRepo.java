package com.example.demo.board;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// 임시 저장소
public class MemoryBoardRepo implements BoardRepo{

    private static Map<Long ,Post> store = new HashMap<>();

    @Override
    public void savePost(Post post) {
        store.put(post.getBno(),post);
    }

    @Override
    public Post findBybno(Long bno) {
        return store.get(bno);
    }

    @Override
    public List<Post> findByTitle(String postTitle) {
        List<Post> Answer = new ArrayList<>();
        for (Long aLong : store.keySet()) {
            Post post = store.get(aLong);
            if(post.getTitle() == postTitle) {
                Answer.add(post);
            }
        }
        return Answer;
    }

    @Override
    public List<Post> findAll() {
        List<Post> Answer = new ArrayList<>();
        for (Long aLong : store.keySet()) {
            Answer.add(store.get(aLong));
        }
        return Answer;
    }


}
