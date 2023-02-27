package com.itstep.onlinephoneshop.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itstep.onlinephoneshop.entity.Users;
import com.itstep.onlinephoneshop.service.UserServices;

/**
 * Servlet implementation class ListUserServlet
 */
@WebServlet("/admin/list_users")
public class ListUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  List<Users> listUser = new UserServices().GetUsers();
	  
	  request.setAttribute("users", listUser);
	  
	  request.getRequestDispatcher("list_users.jsp").forward(request, response);
		
	}

}
