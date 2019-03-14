package com.example.to_play.vo;

public class Reply {
    private int no, userNo;
    private String userImg, userName, content;



    public Reply(){

    }
    public Reply(String userName , String content){
        this.userName = userName;
        this.content = content;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public String getContent() {
        return content;
    }

    public int getNo() {
        return no;
    }

    public String getUserImg() {
        return userImg;
    }

    public int getUserNo() {
        return userNo;
    }

    public String getUserName() {
        return userName;
    }
}
