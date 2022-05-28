package servelets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SignIn", urlPatterns = {"/signIn"})
public class SignIn extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String redirectURl = "calculadora.jsp";

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals("teste") && password.equals("teste")) {
           response.sendRedirect(redirectURl);
        }
        
        try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Error</title>");                
                out.println("<script src=\"https://cdn.tailwindcss.com\"></script>");
                out.println("</head>");
                out.println("<body class=\"flex items-center justify-center h-screen w-screen flex-col gap-16\">");
                out.println("<h1>401 - Unauthorized</h1>");
                out.println("</body>");
                out.println("</html>");
            }
    }

}
