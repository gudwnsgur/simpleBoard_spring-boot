package com.dku.simpleBoard.dto;


import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("CommentDto")
public class CommentDTO {
    private String userName;
    private String commentContent;
    private int commentLikes;
    private Date commentDate;


    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
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
}
