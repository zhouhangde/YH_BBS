package com.wl.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class TbBbs implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 66100964185974428L;

	private BigDecimal bbsId;

    private BigDecimal userId;

    private BigDecimal boardId;

    private BigDecimal bbsBoardid;

    private String bbsTitle;

    private String bbsContent;

    private String bbsSender;
 
    /*DateTimeFormat用于后台接受前台的值*/
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    /*format用于格式化日期*/
	/*@JSONField(format = "yyyy-MM-dd HH:mm:ss")*/
    private Date bbsSendtime;

    private String bbsFace;

    private Date bbsOptime;

    private String bbsIstop;

    private Date bbsTotoptime;

    private String bbsIsgood;

    private Date bbsTogoodtime;

    public BigDecimal getBbsId() {
        return bbsId;
    }

    public void setBbsId(BigDecimal bbsId) {
        this.bbsId = bbsId;
    }

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public BigDecimal getBoardId() {
        return boardId;
    }

    public void setBoardId(BigDecimal boardId) {
        this.boardId = boardId;
    }

    public BigDecimal getBbsBoardid() {
        return bbsBoardid;
    }

    public void setBbsBoardid(BigDecimal bbsBoardid) {
        this.bbsBoardid = bbsBoardid;
    }

    public String getBbsTitle() {
        return bbsTitle;
    }

    public void setBbsTitle(String bbsTitle) {
        this.bbsTitle = bbsTitle == null ? null : bbsTitle.trim();
    }

    public String getBbsContent() {
        return bbsContent;
    }

    public void setBbsContent(String bbsContent) {
        this.bbsContent = bbsContent == null ? null : bbsContent.trim();
    }

    public String getBbsSender() {
        return bbsSender;
    }

    public void setBbsSender(String bbsSender) {
        this.bbsSender = bbsSender == null ? null : bbsSender.trim();
    }

    public Date getBbsSendtime() {
        return bbsSendtime;
    }

    public void setBbsSendtime(Date bbsSendtime) {
        this.bbsSendtime = bbsSendtime;
    }

    public String getBbsFace() {
        return bbsFace;
    }

    public void setBbsFace(String bbsFace) {
        this.bbsFace = bbsFace == null ? null : bbsFace.trim();
    }

    public Date getBbsOptime() {
        return bbsOptime;
    }

    public void setBbsOptime(Date bbsOptime) {
        this.bbsOptime = bbsOptime;
    }

    public String getBbsIstop() {
        return bbsIstop;
    }

    public void setBbsIstop(String bbsIstop) {
        this.bbsIstop = bbsIstop == null ? null : bbsIstop.trim();
    }

    public Date getBbsTotoptime() {
        return bbsTotoptime;
    }

    public void setBbsTotoptime(Date bbsTotoptime) {
        this.bbsTotoptime = bbsTotoptime;
    }

    public String getBbsIsgood() {
        return bbsIsgood;
    }

    public void setBbsIsgood(String bbsIsgood) {
        this.bbsIsgood = bbsIsgood == null ? null : bbsIsgood.trim();
    }

    public Date getBbsTogoodtime() {
        return bbsTogoodtime;
    }

    public void setBbsTogoodtime(Date bbsTogoodtime) {
        this.bbsTogoodtime = bbsTogoodtime;
    }
    
	public TbBbs() {
	}
     
	public TbBbs(BigDecimal bbsId) {
		this.bbsId = bbsId;
	}
    
	public TbBbs(BigDecimal bbsId, BigDecimal userId) {
		this.bbsId = bbsId;
		this.userId = userId;
	}
    
	public TbBbs(BigDecimal bbsId, BigDecimal userId, BigDecimal boardId) {
		this.bbsId = bbsId;
		this.userId = userId;
		this.boardId = boardId;
	}
    
	public TbBbs(BigDecimal bbsId, BigDecimal userId, BigDecimal boardId,
			BigDecimal bbsBoardid) {
		this.bbsId = bbsId;
		this.userId = userId;
		this.boardId = boardId;
		this.bbsBoardid = bbsBoardid;
	}
	
	public TbBbs(BigDecimal bbsId, BigDecimal userId, BigDecimal boardId,
			BigDecimal bbsBoardid, String bbsTitle) {
		this.bbsId = bbsId;
		this.userId = userId;
		this.boardId = boardId;
		this.bbsBoardid = bbsBoardid;
		this.bbsTitle = bbsTitle;
	}

	public TbBbs(BigDecimal bbsId, BigDecimal userId, BigDecimal boardId,
			BigDecimal bbsBoardid, String bbsTitle, String bbsContent) {
		this.bbsId = bbsId;
		this.userId = userId;
		this.boardId = boardId;
		this.bbsBoardid = bbsBoardid;
		this.bbsTitle = bbsTitle;
		this.bbsContent = bbsContent;
	}
	
	public TbBbs(BigDecimal bbsId, BigDecimal userId, BigDecimal boardId,
			BigDecimal bbsBoardid, String bbsTitle, String bbsContent,
			String bbsSender) {
		this.bbsId = bbsId;
		this.userId = userId;
		this.boardId = boardId;
		this.bbsBoardid = bbsBoardid;
		this.bbsTitle = bbsTitle;
		this.bbsContent = bbsContent;
		this.bbsSender = bbsSender;
	}

	
	public TbBbs(BigDecimal bbsId, BigDecimal userId, BigDecimal boardId,
			BigDecimal bbsBoardid, String bbsTitle, String bbsContent,
			String bbsSender, Date bbsSendtime) {
		this.bbsId = bbsId;
		this.userId = userId;
		this.boardId = boardId;
		this.bbsBoardid = bbsBoardid;
		this.bbsTitle = bbsTitle;
		this.bbsContent = bbsContent;
		this.bbsSender = bbsSender;
		this.bbsSendtime = bbsSendtime;
	}

	
	public TbBbs(BigDecimal bbsId, BigDecimal userId, BigDecimal boardId,
			BigDecimal bbsBoardid, String bbsTitle, String bbsContent,
			String bbsSender, Date bbsSendtime, String bbsFace) {
		this.bbsId = bbsId;
		this.userId = userId;
		this.boardId = boardId;
		this.bbsBoardid = bbsBoardid;
		this.bbsTitle = bbsTitle;
		this.bbsContent = bbsContent;
		this.bbsSender = bbsSender;
		this.bbsSendtime = bbsSendtime;
		this.bbsFace = bbsFace;
	}

	public TbBbs(BigDecimal bbsId, BigDecimal userId, BigDecimal boardId,
			BigDecimal bbsBoardid, String bbsTitle, String bbsContent,
			String bbsSender, Date bbsSendtime, String bbsFace, Date bbsOptime) {
		this.bbsId = bbsId;
		this.userId = userId;
		this.boardId = boardId;
		this.bbsBoardid = bbsBoardid;
		this.bbsTitle = bbsTitle;
		this.bbsContent = bbsContent;
		this.bbsSender = bbsSender;
		this.bbsSendtime = bbsSendtime;
		this.bbsFace = bbsFace;
		this.bbsOptime = bbsOptime;
	}

	
	public TbBbs(BigDecimal bbsId, BigDecimal userId, BigDecimal boardId,
			BigDecimal bbsBoardid, String bbsTitle, String bbsContent,
			String bbsSender, Date bbsSendtime, String bbsFace, Date bbsOptime,
			String bbsIstop) {
		this.bbsId = bbsId;
		this.userId = userId;
		this.boardId = boardId;
		this.bbsBoardid = bbsBoardid;
		this.bbsTitle = bbsTitle;
		this.bbsContent = bbsContent;
		this.bbsSender = bbsSender;
		this.bbsSendtime = bbsSendtime;
		this.bbsFace = bbsFace;
		this.bbsOptime = bbsOptime;
		this.bbsIstop = bbsIstop;
	}

	
	public TbBbs(BigDecimal bbsId, BigDecimal userId, BigDecimal boardId,
			BigDecimal bbsBoardid, String bbsTitle, String bbsContent,
			String bbsSender, Date bbsSendtime, String bbsFace, Date bbsOptime,
			String bbsIstop, Date bbsTotoptime) {
		this.bbsId = bbsId;
		this.userId = userId;
		this.boardId = boardId;
		this.bbsBoardid = bbsBoardid;
		this.bbsTitle = bbsTitle;
		this.bbsContent = bbsContent;
		this.bbsSender = bbsSender;
		this.bbsSendtime = bbsSendtime;
		this.bbsFace = bbsFace;
		this.bbsOptime = bbsOptime;
		this.bbsIstop = bbsIstop;
		this.bbsTotoptime = bbsTotoptime;
	}

	public TbBbs(BigDecimal bbsId, BigDecimal userId, BigDecimal boardId,
			BigDecimal bbsBoardid, String bbsTitle, String bbsContent,
			String bbsSender, Date bbsSendtime, String bbsFace, Date bbsOptime,
			String bbsIstop, Date bbsTotoptime, String bbsIsgood) {
		this.bbsId = bbsId;
		this.userId = userId;
		this.boardId = boardId;
		this.bbsBoardid = bbsBoardid;
		this.bbsTitle = bbsTitle;
		this.bbsContent = bbsContent;
		this.bbsSender = bbsSender;
		this.bbsSendtime = bbsSendtime;
		this.bbsFace = bbsFace;
		this.bbsOptime = bbsOptime;
		this.bbsIstop = bbsIstop;
		this.bbsTotoptime = bbsTotoptime;
		this.bbsIsgood = bbsIsgood;
	}

	public TbBbs(BigDecimal bbsId, BigDecimal userId, BigDecimal boardId,
			BigDecimal bbsBoardid, String bbsTitle, String bbsContent,
			String bbsSender, Date bbsSendtime, String bbsFace, Date bbsOptime,
			String bbsIstop, Date bbsTotoptime, String bbsIsgood,
			Date bbsTogoodtime) {
		this.bbsId = bbsId;
		this.userId = userId;
		this.boardId = boardId;
		this.bbsBoardid = bbsBoardid;
		this.bbsTitle = bbsTitle;
		this.bbsContent = bbsContent;
		this.bbsSender = bbsSender;
		this.bbsSendtime = bbsSendtime;
		this.bbsFace = bbsFace;
		this.bbsOptime = bbsOptime;
		this.bbsIstop = bbsIstop;
		this.bbsTotoptime = bbsTotoptime;
		this.bbsIsgood = bbsIsgood;
		this.bbsTogoodtime = bbsTogoodtime;
	}

	@Override
	public String toString() {
		return "TbBbs [bbsId=" + bbsId + ", userId=" + userId + ", boardId="
				+ boardId + ", bbsBoardid=" + bbsBoardid + ", bbsTitle="
				+ bbsTitle + ", bbsContent=" + bbsContent + ", bbsSender="
				+ bbsSender + ", bbsSendtime=" + bbsSendtime + ", bbsFace="
				+ bbsFace + ", bbsOptime=" + bbsOptime + ", bbsIstop="
				+ bbsIstop + ", bbsTotoptime=" + bbsTotoptime + ", bbsIsgood="
				+ bbsIsgood + ", bbsTogoodtime=" + bbsTogoodtime + "]";
	}


    
}