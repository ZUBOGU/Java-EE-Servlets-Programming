package com.servletapplicationsdemo;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/*  URL to retrieve this class:
    http://localhost:8080/servletapplicationsdemo/HelloWorld
 */
@WebServlet("/HelloWorld")
public class HelloWorld extends GenericServlet {
    private static final Long serialVersionUID = 1L;

    public HelloWorld() {
        super();
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        out.println("Java EE Servlets Programming");
    }

}