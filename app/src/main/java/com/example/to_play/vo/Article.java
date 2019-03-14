package com.example.to_play.vo;

import android.util.Log;

import java.sql.Timestamp;

public class Article {
    private int no, like, view, comment;
    private String title, img, name;
    private Timestamp regdate;

    public Article() {

    }

    public Article(int no, String title, String name, String img, int like, int view, int comment) {
        this.no = no;
        this.title = title;
        this.name = name;
        this.img = img;
        this.like = like;
        this.view = view;
        this.comment = comment;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public void setView(int view) {
        this.view = view;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setRegdate(Timestamp regdate) {
        this.regdate = regdate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getComment() {
        return comment;
    }

    public int getLike() {
        return like;
    }

    public int getNo() {
        return no;
    }

    public int getView() {
        return view;
    }

    public String getImg() {
        return img;
    }

    public String getTitle() {
        return title;
    }

    public Timestamp getRegdate() {
        return regdate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


