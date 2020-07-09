package com.dku.simpleBoard.dto;

import org.apache.ibatis.type.Alias;

@Alias("LikeDto")
public class LikeDTO {
    private Integer userNo;
    private Integer boardNo;
    private boolean likes;

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

    public boolean isLikes() {
        return likes;
    }

    public void setLikes(boolean likes) {
        this.likes = likes;
    }
}
