package com.example.demo.board;

public class Post {
    private Long bno;
    private String title;
    private String content;

    public Post(Long bno, String title, String content) {
        this.bno = bno;
        this.title = title;
        this.content = content;
    }

    public Long getBno() {
        return bno;
    }

    public void setBno(Long bno) {
        this.bno = bno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
