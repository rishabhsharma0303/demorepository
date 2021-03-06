package com.customer.webapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.customer.dao.Customer;
import com.customer.dao.CustomerDao;
import com.customer.dao.CustomerDaoImpl;
import com.customer.exceptions.DataAccessException;

import java.util.*;

/**
 * Servlet implementation class CustomerController
 */
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerDao customerService=new CustomerDaoImpl();
	@Override
	/*
	 * public void init(ServletConfig config) throws ServletException { // TODO
	 * Auto-generated method stub super.init(config); try {
	 * Class.forName("com.mysql.jdbc.Driver");
	 * System.out.println("---------driver is loaded----------");
	 * }catch(ClassNotFoundException ex) {
	 * 
	 * } }
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
//		name
//		address
//		mobile
//		email
		response.setContentType("text/html");
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		String mobile=request.getParameter("mobile");
		String email=request.getParameter("email");
		
	
		PrintWriter out=response.getWriter();
		
Customer customer=new Customer(name, address, mobile, email);
		
		try{
			customerService.addCustomer(customer);
		}catch(DataAccessException ex) {
			System.out.println(ex.getMessage());
		}
		
		out.print("you are registered"+"<br/>");
		out.print("name:"+name+"<br/>");
		out.print("address:"+address+"<br/>");
		out.print("mobile:"+mobile+"<br/>");
		out.print("email:"+email+"<br/>");

	}

	

}
