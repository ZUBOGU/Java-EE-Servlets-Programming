package com.servletapplicationsdemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/*  URL to retrieve this class:
    http://localhost:8080/servletapplicationsdemo/LargeServletPage
 */
@WebServlet("/LargeServletPage")
public class LargeServletPage extends HttpServlet {
    private static final Long serialVersionUID = 1L;

    public LargeServletPage() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out;

        if(GzipUtility.isGzipSupported(request) && !GzipUtility.isGzipDisabled(request) ){
            out = GzipUtility.getGzipWriter(response);
            response.setHeader("Content-Encoding", "gzip");
        }
        else{
            out = response.getWriter();
        }

        String dummyLine = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

        out.println("<!Doctype HTML>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Demo: Request Headers</title>");
        out.println("</head>");
        out.println("<body>");

        for (int i = 0; i < 10000; i++) {
            out.println(dummyLine + "</br>");
        }

        out.println("</body>");
        out.println("</html>");
        out.close();

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}