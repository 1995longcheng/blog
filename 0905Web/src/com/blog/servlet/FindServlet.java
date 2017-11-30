package com.blog.servlet;


	import java.io.IOException;
	import java.io.PrintWriter;

	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	import com.blog.friend.entity.Friend;
	import com.blog.friend.service.FriendService;
	import com.blog.friend.service.FriendServiceImpl;

	public class FindServlet extends HttpServlet {
	 
		private FriendService friendService=new FriendServiceImpl();
		
		public void setFriendService(FriendService friendService) {
			this.friendService = friendService;
		}

		public void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
	            String nextPage="/WEB-INF/showOne.jsp";
			String strfid=request.getParameter("fid");
			//如果用户没有输入好友ID，直接查询所有的好友信息
			if(strfid==null||"".equals(strfid)){
				nextPage="servlet/ShowServlet";
			}else{		
				int fid=Integer.parseInt(strfid);
			Friend friend=friendService.findById(fid);
			request.setAttribute("friend", friend);
			}
			request.getRequestDispatcher(nextPage).forward(request, response); 
			}

		public void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
	            doGet(request,response);
		}
}
