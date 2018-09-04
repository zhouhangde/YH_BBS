package com.wl.entity;

import java.math.BigDecimal;

public class TbBoard {
    private BigDecimal boardId;

    private BigDecimal classId;

    private BigDecimal boardClassid;

    private String boardName;

    private String boardMaster;

    private String boardPcard;

    public BigDecimal getBoardId() {
        return boardId;
    }

    public void setBoardId(BigDecimal boardId) {
        this.boardId = boardId;
    }

    public BigDecimal getClassId() {
        return classId;
    }

    public void setClassId(BigDecimal classId) {
        this.classId = classId;
    }

    public BigDecimal getBoardClassid() {
        return boardClassid;
    }

    public void setBoardClassid(BigDecimal boardClassid) {
        this.boardClassid = boardClassid;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName == null ? null : boardName.trim();
    }

    public String getBoardMaster() {
        return boardMaster;
    }

    public void setBoardMaster(String boardMaster) {
        this.boardMaster = boardMaster == null ? null : boardMaster.trim();
    }

    public String getBoardPcard() {
        return boardPcard;
    }

    public void setBoardPcard(String boardPcard) {
        this.boardPcard = boardPcard == null ? null : boardPcard.trim();
    }
}