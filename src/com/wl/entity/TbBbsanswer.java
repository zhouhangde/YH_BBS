package com.wl.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TbBbsanswer {
    private BigDecimal bbsanswerId;

    private BigDecimal bbsId;

    private BigDecimal bbsanswerRootid;

    private String bbsanswerTitle;

    private String bbsanswerContent;

    private String bbsanswerSender;

    private Date bbsanswerSendtime;

    private String bbsanswerFace;

    public BigDecimal getBbsanswerId() {
        return bbsanswerId;
    }

    public void setBbsanswerId(BigDecimal bbsanswerId) {
        this.bbsanswerId = bbsanswerId;
    }

    public BigDecimal getBbsId() {
        return bbsId;
    }

    public void setBbsId(BigDecimal bbsId) {
        this.bbsId = bbsId;
    }

    public BigDecimal getBbsanswerRootid() {
        return bbsanswerRootid;
    }

    public void setBbsanswerRootid(BigDecimal bbsanswerRootid) {
        this.bbsanswerRootid = bbsanswerRootid;
    }

    public String getBbsanswerTitle() {
        return bbsanswerTitle;
    }

    public void setBbsanswerTitle(String bbsanswerTitle) {
        this.bbsanswerTitle = bbsanswerTitle == null ? null : bbsanswerTitle.trim();
    }

    public String getBbsanswerContent() {
        return bbsanswerContent;
    }

    public void setBbsanswerContent(String bbsanswerContent) {
        this.bbsanswerContent = bbsanswerContent == null ? null : bbsanswerContent.trim();
    }

    public String getBbsanswerSender() {
        return bbsanswerSender;
    }

    public void setBbsanswerSender(String bbsanswerSender) {
        this.bbsanswerSender = bbsanswerSender == null ? null : bbsanswerSender.trim();
    }

    public Date getBbsanswerSendtime() {
        return bbsanswerSendtime;
    }

    public void setBbsanswerSendtime(Date bbsanswerSendtime) {
        this.bbsanswerSendtime = bbsanswerSendtime;
    }

    public String getBbsanswerFace() {
        return bbsanswerFace;
    }

    public void setBbsanswerFace(String bbsanswerFace) {
        this.bbsanswerFace = bbsanswerFace == null ? null : bbsanswerFace.trim();
    }
}