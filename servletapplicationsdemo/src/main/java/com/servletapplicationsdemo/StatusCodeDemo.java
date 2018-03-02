package com.servletapplicationsdemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*  URL to retrieve this class:
    http://localhost:8080/servletapplicationsdemo/StatusCodeDemo
 */
@WebServlet("/StatusCodeDemo")
public class StatusCodeDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public StatusCodeDemo() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	//String siteName = "https://www.google.com/";
    	// response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
    	// response.setHeader("Location", siteName);

        // response.sendRedirect(siteName);

		response.sendError(401,"Unauthorized request: need userName and passWord");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
