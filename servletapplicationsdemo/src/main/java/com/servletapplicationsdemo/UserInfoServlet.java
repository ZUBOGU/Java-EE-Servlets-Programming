package com.servletapplicationsdemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/UserInfoServlet")
public class UserInfoServlet extends HttpServlet {
    private static final Long serialVersionUID = 1L;

    public UserInfoServlet() {
        super();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        resp.getWriter().append("Served at :").append(req.getContextPath());
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

}