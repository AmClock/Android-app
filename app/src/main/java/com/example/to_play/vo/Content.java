package com.example.to_play.vo;

import android.util.Log;

public class Content {
    private int no, seq;
    private String content, img;


    public  Content(){

    }

    public  Content(String content){
         this.content = content;
        Log.i("vo :: ?/ ", "Content: " + this.content);
    }


    public void setNo(int no) {
        this.no = no;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public int getNo() {
        return no;
    }

    public int getSeq() {
        return seq;
    }

    public String getImg() {
        return img;
    }

    public String getContent() {
        return content;
    }
}
