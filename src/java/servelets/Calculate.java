package servelets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Calculate", urlPatterns = {"/calculate"})
public class Calculate extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        Double nota1 = Double.parseDouble(request.getParameter("nota1"));
        Double nota2 = Double.parseDouble(request.getParameter("nota2"));
        Double media = (nota1 + nota2) / 2;

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultado</title>");
            out.println("<script src=\"https://cdn.tailwindcss.com\"></script>");
            out.println("</head>");
            out.println("<body class=\"flex items-center justify-center h-screen w-screen flex-col gap-16\">");
            out.println("<h1>A média de suas notas é " + media + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
