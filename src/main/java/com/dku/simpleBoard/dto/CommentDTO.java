package com.dku.simpleBoard.dto;

import org.apache.ibatis.type.Alias;

@Alias("CommentDto")
public class CommentDTO {
    private String userName;
    private Integer userNo;
    private Integer boardNo;
    private Integer commentNo;
    private String commentContent;
    private int commentLikes;
    private String commentDate;

    public CommentDTO(){}
    public CommentDTO(Integer boardNo, Integer userNo, String commentContent) {
        this.boardNo=boardNo;
        this.userNo=userNo;
        this.commentContent=commentContent;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public int getCommentLikes() {
        return commentLikes;
    }

    public void setCommentLikes(int commentLikes) {
        this.commentLikes = commentLikes;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(String commentDate) {
        this.commentDate = commentDate;
    }

    public Integer getCommentNo() {
        return commentNo;
    }

    public void setCommentNo(Integer commentNo) {
        this.commentNo = commentNo;
    }

    public Integer getUserNo() {
        return userNo;
    }

    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }

    public Integer getBoardNo() {
        return boardNo;
    }

    public void setBoardNo(Integer boardNo) {
        this.boardNo = boardNo;
    }
}
