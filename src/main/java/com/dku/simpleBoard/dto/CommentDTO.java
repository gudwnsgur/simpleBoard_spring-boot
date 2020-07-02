package com.dku.simpleBoard.dto;


import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("CommentDto")
public class CommentDTO {
    private int userNo;
    private int boardNo;
    private String commentContent;
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

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public int getBoardNo() {
        return boardNo;
    }

    public void setBoardNo(int boardNo) {
        this.boardNo = boardNo;
    }
}
