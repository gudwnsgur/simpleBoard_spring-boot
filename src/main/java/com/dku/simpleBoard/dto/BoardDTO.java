package com.dku.simpleBoard.dto;

import org.apache.ibatis.type.Alias;

@Alias("BoardDto")
public class BoardDTO {
    private String userName;
    private int boardNo;
    private String boardTitle;
    private String boardContent;
    private int commentCount;
    private int boardViews;
    private int boardLikes;
    private String boardDate;

    public BoardDTO() {}

    public String getBoardTitle() {
        return boardTitle;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public String getBoardContent() {
        return boardContent;
    }

    public void setBoardContent(String boardContent) {
        this.boardContent = boardContent;
    }

    public int getBoardViews() {
        return boardViews;
    }

    public void setBoardViews(int boardViews) {
        this.boardViews = boardViews;
    }


    public int getBoardLikes() {
        return boardLikes;
    }

    public void setBoardLikes(int boardLikes) {
        this.boardLikes = boardLikes;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public String getBoardDate() {
        return boardDate;
    }

    public void setBoardDate(String boardDate) {
        this.boardDate = boardDate;
    }


    public Integer getBoardNo() {
        return boardNo;
    }

    public void setBoardNo(Integer boardNo) {
        this.boardNo = boardNo;
    }
}
