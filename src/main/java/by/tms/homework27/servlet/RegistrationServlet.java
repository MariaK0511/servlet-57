package by.tms.homework27.servlet;
import by.tms.homework27.entity.Info;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/registration.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Info info = new Info();
        info.setFirstName(req.getParameter("firstName"));
        info.setLastName(req.getParameter("lastName"));
        info.setEmail(req.getParameter("email"));
        info.setPassword(req.getParameter("password"));
        req.setAttribute("registration", info);
        getServletContext().getRequestDispatcher("/pages/registration.jsp").forward(req, resp);
    }
}
