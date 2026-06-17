/* Alisson Ramos
   Nayara Pereira */

package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ler")
public class LerCookieServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        String nome = "Visitante";

        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("usuario")) {
                    nome = cookie.getValue();
                }
            }
        }

        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Bem-vindo " + nome + "</h1>");
        out.println("<a href='index.jsp'>Voltar</a>");
        out.println("</body>");
        out.println("</html>");
    }
}
