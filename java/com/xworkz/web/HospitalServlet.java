package com.xworkz.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup=4,urlPatterns="/m4")
public class HospitalServlet extends HttpServlet

{
	public HospitalServlet()
	{
		System.out.println(" Hospital ");
		
	}
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	System.out.println("Hospital is open ");
    }
}


