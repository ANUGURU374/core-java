package com.xworkz.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup=7,urlPatterns="/m7")
public class FlowersServlet extends HttpServlet 
{
	public FlowersServlet() {
		System.out.println(" beach ");
		
	}
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	System.out.println(" i love beach ");
    }
}

