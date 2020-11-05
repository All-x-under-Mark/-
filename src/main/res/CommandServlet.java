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
    private Comand war;




    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init();

        sList = new CommandList();
        war = new Comand();



    }

    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("som", sList);



            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Table.jsp");
            requestDispatcher.forward(req, resp);
        }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");

        if ("submit".equals(action)) {
       //     sList.sList.set(0, war.setName(request.getParameter("text")));
           war.setName(request.getParameter("text"));
        //   war.setName("jgf");


        }
        request.setAttribute("war", war);

        request.setAttribute("som", sList);
        request.getRequestDispatcher("/Table.jsp").forward(request, response);
    }




}

