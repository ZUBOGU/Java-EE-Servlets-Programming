package com.servletapplicationsdemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;


/*  URL to retrieve this class:
    http://localhost:8080/servletapplicationsdemo/UserInfoServlet?firstName=zubo&lastName=gu
 */
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

        //Usage of getParameter(String name)
        out.println("<h3>Reading QueryString data using 'String getParameter(String name)' method : </h3>" );
        out.println("<div>");
        out.println("<p>First Name : " + firstName + "</p>");
        out.println("<p>Last Name : " + lastName + "</p>");
        out.println("</div>");

        //Usage of getParameterNames()
        out.println("<h3>Reading QueryString data using 'Enumeration getParameterNames()' method : </h3>");
        Enumeration<String> paramNames = req.getParameterNames();
        out.println( "<div>");
        while( paramNames.hasMoreElements() )
        {
            String paramName = paramNames.nextElement();
            String paramValue = req.getParameter(paramName);
            out.println( "<p>" + paramName + " : " +  paramValue + "</p>");
        }
        out.println( "</div>");

        // Usage of getParameterMap()
        out.println("<h3>Read QueryString data using 'Map getParameterMap()' method </h3>");

        Map<String, String[]> paramMap = req.getParameterMap();
        Set<String> paramNamesSet = paramMap.keySet();
        out.println( "<div>");
        for(String paramName : paramNamesSet)
        {
            String[] paramValues = paramMap.get(paramName);
            out.println( "<p>" + paramName + " : " );
            for( int i=0; i< paramValues.length; i++ )
            {
                out.println( paramValues[i]  + "</p>");
            }
        }
        out.println( "</div>");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

}