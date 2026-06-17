/* Alisson Ramos
   Nayara Pereira */

package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/salvar")
public class SalvarCookieServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nome = request.getParameter("nome");

        Cookie cookie = new Cookie("usuario", nome);
        cookie.setMaxAge(86400);

        response.addCookie(cookie);

        response.sendRedirect("resultado.jsp");
    }
}
