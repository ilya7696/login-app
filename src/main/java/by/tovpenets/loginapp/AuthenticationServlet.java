package by.tovpenets.loginapp;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/authentication")
public class AuthenticationServlet extends HttpServlet {

    private static final String ADMIN_LOGIN = "spidey";

    private static final String ADMIN_PASSWORD = "admin";

    private static final String LOGIN_ATTRIBUTE = "login";

    private static final String PASSWORD_ATTRIBUTE = "password";

    protected static final String IS_ADMIN = "is_admin";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        if (ADMIN_LOGIN.equals(req.getParameter(LOGIN_ATTRIBUTE))
            && ADMIN_PASSWORD.equals(req.getParameter(PASSWORD_ATTRIBUTE))) {
            req.getSession().setAttribute(IS_ADMIN, true);
            resp.sendRedirect("admin");
        } else {
            resp.sendRedirect(req.getContextPath());
        }
    }
}
