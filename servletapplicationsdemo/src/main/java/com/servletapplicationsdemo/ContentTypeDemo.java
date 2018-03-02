package com.servletapplicationsdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*  URL to retrieve this class:
    http://localhost:8080/servletapplicationsdemo/ContentTypeDemo
 */
@WebServlet("/ContentTypeDemo")
public class ContentTypeDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ContentTypeDemo() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/vnd.ms-excel");
		
		PrintWriter out = response.getWriter();
		
		out.println("Rno\tName\tMaths\tPhys\tComputer Sc\tTotal");
		out.println("101\tSekhar\t90\t90\t90\t=SUM(B2:D2)");
		out.println("102\tSrinivasan\t95\t95\t95\t=SUM(B2:D2)");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
