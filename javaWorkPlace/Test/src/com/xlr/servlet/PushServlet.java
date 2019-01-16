package com.xlr.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xlr.model.Audio;
import com.xlr.model.OneCategoey;
import com.xlr.model.TwoCategory;
import com.xlr.util.JDBUtil;

@WebServlet("/PushServlet")
public class PushServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public PushServlet() {
        super();      
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JDBUtil db = new JDBUtil();
		List<Audio> audios= db.getUsername(null);
		List<OneCategoey> one_categorys = db.getOneCategory();
		List<TwoCategory> two_categorys = db.getTwoCategory();
		request.setAttribute("audios", audios);
		request.setAttribute("one_categorys", one_categorys);
		request.setAttribute("two_categorys", two_categorys);
		request.getRequestDispatcher("first.jsp").forward(request, response);
		return;
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
