package by.tovpenets.loginapp;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.AccessDeniedException;

import static by.tovpenets.loginapp.AuthenticationServlet.IS_ADMIN;

@WebServlet(urlPatterns = "/admin")
public class AdminServlet extends HttpServlet {

    private static final String ADMIN_VIEW_HTML = "<!doctype html>\n" +
            "\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "  <title>Admin resource</title>\n" +
            "</head>\n" +
            "\n" +
            "<body>\n" +
            "     <h1>You are an admin!</h1><br>\n" +
            "    <a href=\"logout\">exit from session</a>\n" +
            "</body>\n" +
            "</html>";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        if (req.getSession().getAttribute(IS_ADMIN) != null) {
            resp.setContentType("text/html");
            resp.getWriter().write(ADMIN_VIEW_HTML);
        } else {
            throw new AccessDeniedException("User is not an admin");
        }
    }
}
