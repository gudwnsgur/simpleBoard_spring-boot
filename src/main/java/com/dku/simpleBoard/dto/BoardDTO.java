package com.dku.simpleBoard.dto;

import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("BoardDto")
public class BoardDTO {
    private int userNo;
    private String boardTitle;
    private String boardContent;
    private int boardViews;
    private int boardLikes;
    private Date boardDate;

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

    public Date getBoardDate() {
        return boardDate;
    }

    public void setBoardDate(Date boardDate) {
        this.boardDate = boardDate;
    }


    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public int getBoardLikes() {
        return boardLikes;
    }

    public void setBoardLikes(int boardLikes) {
        this.boardLikes = boardLikes;
    }
}
