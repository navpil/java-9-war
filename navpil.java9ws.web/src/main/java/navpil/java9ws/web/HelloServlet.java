package navpil.java9ws.web;

import navpil.java9ws.core.GreetingsList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "j9hello", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    private GreetingsList greetingsList;

    @Override
    public void init(ServletConfig config) throws ServletException {
        greetingsList = new GreetingsList();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().append("Greetings are ").append(greetingsList.getGreetings().toString());
    }
}
