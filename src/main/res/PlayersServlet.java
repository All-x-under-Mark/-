
package main.res;


import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/Сommand")
public class PlayersServlet extends HttpServlet {

    private TestMap testMap;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init();

        testMap = new TestMap();
    }

   /* protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("player", testMap);
        request.setAttribute("age", 34);

        getServletContext().getRequestDispatcher("/Сommand.jsp").forward(request, response);
        }
*/
        protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.setAttribute("player", testMap);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Command.jsp");
            requestDispatcher.forward(req, resp);
        }
    }

