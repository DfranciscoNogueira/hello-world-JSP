package br.com.estudo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/OlaMundo")
public class OlaMundoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public OlaMundoServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();

        printWriter.println("<!DOCTYPE html>");
        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<title>Ola Mundo</title>");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("<h1>Ola Mundo</h1>");
        printWriter.println("<p>Estudando um pouco de JSP</p>");
        printWriter.println("</body>");
        printWriter.println("</html>");

    }

}
