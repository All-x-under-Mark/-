
package main.res;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/Сommand")
public class PlayersServlet extends HttpServlet {

    private TestMap testMap;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("игрок", testMap);
        request.setAttribute("age", 34);

        getServletContext().getRequestDispatcher("/Сommand.jsp").forward(request, response);



    }
}
