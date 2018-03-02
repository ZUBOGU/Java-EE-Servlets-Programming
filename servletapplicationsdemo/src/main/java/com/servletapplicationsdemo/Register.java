package com.servletapplicationsdemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*  URL to retrieve this class:
    http://localhost:8080/servletapplicationsdemo/Register
    By clicking start page http://localhost:8080/servletapplicationsdemo, register button.
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
    private static final Long serialVersionUID = 1L;

    public Register() {
        super();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("userName");
        String passwd = req.getParameter("passwd");
        String gender = req.getParameter("gender");
        String[] hobbies = req.getParameterValues("hobbies");
        String country = req.getParameter("country");
        String[] languages= req.getParameterValues("languages");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<div>");
        out.println("<p>User name : " + username + "</p>");
        out.println("<p>Password : " + passwd + "</p>");
        out.println("<p>Sex : " + gender + "</p>");
        out.println("<p>Hobbies : <br>" );
        for (int i = 0; i < hobbies.length; i++) {
            out.println(hobbies[i] + "<br>");
        }
        out.println("</p>");
        out.println("<p>Country : "  + country + "</p>");
        out.println("<p>Languages Known : <br>");
        for (int i = 0; i < languages.length; i++) {
            out.println(languages[i] + "<br>");
        }
        out.println("</p>");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

}