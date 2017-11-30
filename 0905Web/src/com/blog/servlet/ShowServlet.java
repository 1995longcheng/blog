package com.blog.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.blog.friend.entity.Friend;
import com.blog.friend.service.FriendService;
import com.blog.friend.service.FriendServiceImpl;

public class ShowServlet extends HttpServlet {

	private int pageSize = 10;//Ĭ��ÿҳ10��
	private int pageIndex = 1;
	private FriendService deptService = new FriendServiceImpl();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// //��ѯ���ݿ�
		
		String pageIndexStr = request.getParameter("pageIndex");
		String pageSizeStr = request.getParameter("pageSize");
		// Ҫ�ж��Ƿ�Ϊ�գ�ʡ��
		// ���ҳ������
		if (pageIndexStr != null && !pageIndexStr.equals("")) {
			pageIndex = Integer.parseInt(pageIndexStr);
		}

		if (pageSizeStr != null && !pageSizeStr.equals("")) {
			pageSize = Integer.parseInt(pageSizeStr);
		}
		int pageMax=deptService.getPageMax(pageSize);
       		
		List<Friend> list = deptService.getAllFriendByPage(pageIndex, pageSize);

		request.setAttribute("cityList", list);
        request.setAttribute("pageMax", pageMax);
		request.getRequestDispatcher("/WEB-INF/show.jsp").forward(request,
				response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}


}
