package com.classproject.servlet;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.classproject.domain.Book;
import com.classproject.service.BookService;
import com.classproject.tools.CommonUtil;

public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BookServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String methodName = request.getParameter("method");
		try {
			Method method = getClass().getDeclaredMethod(methodName, HttpServletRequest.class,
					HttpServletResponse.class);
			// 获取私有成员变量
			method.setAccessible(true);
			method.invoke(this, request, response);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}

	// 创建Service层对象
	BookService bookService = new BookService();

	// 条件检索书籍
	protected void jiansuo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(".........");
		// 获得用户输入的检索条件
		String author = request.getParameter("author");
		String name = request.getParameter("name");
		String title = request.getParameter("title");
		String price1 = request.getParameter("price1");
		String price2 = request.getParameter("price2");

		// 调用Service层用于检索书籍的方法
		List<Book> list = bookService.SerachBookByCondition(author, title, name, price1, price2);

		// 将查询的结果放入request域中
		request.setAttribute("list", list);

		// 显示查询结果集
		request.getRequestDispatcher("/WEB-INF/page/content.jsp").forward(request, response);
	}
	
	protected void list(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Book> list = bookService.list();
		request.setAttribute("list", list);
		long shopCout = CommonUtil.getShopCount(request);
		request.setAttribute("shopCout", shopCout);
		request.getRequestDispatcher("/WEB-INF/page/content.jsp").forward(request, response);
		return;
	}

	protected void deleteBook(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Integer bookId = Integer.parseInt(request.getParameter("bookId"));
		bookService.deleteBook(bookId);
		list(request, response);
	}
}
