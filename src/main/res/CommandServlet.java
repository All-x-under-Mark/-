package main.res;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(value = "/Table")
public class CommandServlet extends HttpServlet {

    private  CommandList sList ;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init();

        sList = new CommandList();
    }

    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("som", sList);
        req.setAttribute("age", 34);


            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Table.jsp");
            requestDispatcher.forward(req, resp);
        }
    }

