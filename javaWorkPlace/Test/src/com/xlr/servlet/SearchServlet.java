package com.xlr.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xlr.model.Audio;
import com.xlr.util.JDBUtil;
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private static int temp=0;

    public SearchServlet() {
        super();    
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		temp=1;
		doPost(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String search = null;
		if(temp==1){
			search=new String(request.getParameter(search).getBytes("ISO-8859-1"),"UTF-8");
			temp=0;
		}
		else{
			search=request.getParameter(search);
		}
		JDBUtil db=new JDBUtil();
		List<Audio> users= db.getUsername(search);
		for(Audio user: users){
			System.out.println(user.getPath1());
			request.setAttribute("user",user);	
		}
		request.getRequestDispatcher("first.jsp").forward(request, response);
		return;
	}

}
