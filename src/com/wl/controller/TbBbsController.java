package com.wl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.wl.entity.Page;
import com.wl.entity.TbBbs;
import com.wl.service.TbBbsService;

@Controller
@RequestMapping("tbBbs")
public class TbBbsController {

	@Resource
	private TbBbsService tbBbsService;

	@RequestMapping("insertTbBbs")
	public String insertTbBbs(HttpServletRequest request,
			HttpServletResponse response, TbBbs tbBbs) throws Exception {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		tbBbs.setBbsTitle(new String(tbBbs.getBbsTitle().getBytes("ISO-8859-1"),
				"UTF-8"));
		Date date =new Date();
		tbBbs.setBbsSendtime(date);
		tbBbs.setBbsOptime(date);
		System.out.println(tbBbs.getBbsIstop());
		if(tbBbs.getBbsIstop()=="1"){
			tbBbs.setBbsTotoptime(date);
		}
		if(tbBbs.getBbsIsgood()=="1"){
			tbBbs.setBbsTogoodtime(date);
		}
		tbBbsService.insertTbBbs(tbBbs);
		return "redirect:listTbBbs.do";	
	}
	
	@RequestMapping("queryTbBbsById")
	public String queryTbBbsById(HttpServletRequest request,
			BigDecimal id) throws Exception {
		request.setCharacterEncoding("UTF-8");
		System.out.println(id);
		TbBbs tbBbs = tbBbsService.queryTbBbsById(id);
		System.out.println(tbBbs.getBbsSendtime());
		request.setAttribute("tbBbs", tbBbs);
		return "../tbTbs/update.jsp";
	}
	
	@RequestMapping("updateTbBbs")
	public String updateTbBbs(HttpServletRequest request,
			TbBbs tbBbs) throws Exception {
		/*Map<String, Object> map = new HashMap<String, Object>();*/
		System.out.println(tbBbs);
		tbBbs.setBbsTitle(new String(tbBbs.getBbsTitle().getBytes("ISO-8859-1"),
				"UTF-8"));
		tbBbs.setBbsContent(new String(tbBbs.getBbsContent().getBytes("ISO-8859-1"),
				"UTF-8"));
		request.setCharacterEncoding("UTF-8");
		tbBbsService.updateTbBbs(tbBbs);
		/*map.put("blog", thisblog);*/
		return "redirect:listTbBbs.do";
	}

	@RequestMapping("listTbBbs")
	public String listTbBbs(HttpServletRequest request) {
		List<TbBbs> tbBbsList = tbBbsService.listTbBbs();
		request.setAttribute("listTbBbs", tbBbsList);
		System.out.println(request.getAttribute("listTbBbs"));
		/*因为前面有/blog*/
		return "../tbTbs/list.jsp";
	}
	
	@RequestMapping("deleteTbBbsByid")
	public String deleteTbBbsByid(HttpServletRequest request,BigDecimal id) {
		System.out.println(id);
		Integer bbsId = tbBbsService.deleteTbBbsByid(id);
		return "redirect:listTbBbs.do";
	}
	
	@RequestMapping("showTbBbsByPage")
	public String showTbBbsByPage(HttpServletRequest request, TbBbs tbBbs) {
		   String pageNow = request.getParameter("pageNow");
		   List<TbBbs> tbBbsPage;
	       Page page = null; 
	       
	        //查询用户总数
	        int totalCount = (int) tbBbsService.getTbBbsCount();
	       
	        if (pageNow != null) { 
	            page = new Page(totalCount, Integer.parseInt(pageNow));
	            tbBbsPage= this.tbBbsService.selectTbBbsByPage(page.getStartPos(), page.getEndPos()); 
	            request.setAttribute("pageNow", pageNow); 
	        } else { 
	            page = new Page(totalCount, 1); 
	            tbBbsPage= this.tbBbsService.selectTbBbsByPage(page.getStartPos(), page.getEndPos());
	            request.setAttribute("pageNow", 1); 
	        } 
			
			request.setAttribute("listTbBbs", tbBbsPage);
	        request.setAttribute("page", page.getTotalPageCount()); 
		/*因为前面有/blog*/
		return "../tbTbs/list.jsp";
	}
	
	@RequestMapping("SelectTbBbsLike")
	public String SelectTbBbsLike(HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("UTF-8");
		String TJ = request.getParameter("select");
	    String value = request.getParameter("value");
	    if(TJ.equals("帖子标题")){
	    	TJ = "BBS_TITLE";
	    }else if(TJ.equals("帖子的发布者")){
	    	TJ = "BBS_SENDER";
	    }else if(TJ.equals("是否为置顶帖子")){
	    	TJ = "BBS_ISTOP";
	    }else if(TJ.equals("是否为精华帖子")){
	    	TJ = "BBS_ISGOOD";
	    }
		List<TbBbs> tbBbsLike = tbBbsService.SelectTbBbsLike(TJ,value);
		request.setAttribute("listTbBbs", tbBbsLike); 
		request.setAttribute("pageNow", 0);
		/*request.setAttribute("TJ", TJ); */
		return "../tbTbs/list.jsp";
	}
	
	@RequestMapping("SelectTbBbsOrder")
	public String SelectTbBbsOrder(HttpServletRequest request,HttpServletResponse response, TbBbs tbBbs) throws Exception {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		tbBbs.setBbsTitle(new String(tbBbs.getBbsTitle().getBytes("ISO-8859-1"),
				"UTF-8"));
		System.out.println(tbBbs);
		List<TbBbs> tbBbsOrder = tbBbsService.SelectTbBbsOrder(tbBbs);
		request.setAttribute("listTbBbs", tbBbsOrder); 
		request.setAttribute("pageNow", 0);
		/*request.setAttribute("TJ", TJ); */
		return "../tbTbs/list.jsp";
	}
}
