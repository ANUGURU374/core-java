package com.xworkz.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup=2,urlPatterns="/m2")
public class ChocolateServlet extends HttpServlet{

	public ChocolateServlet() {
		System.out.println(" chocolate server is created");
		
	}
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	System.out.println(" do get method is called");
    }
}
