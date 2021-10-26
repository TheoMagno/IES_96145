package lab21;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet(name = "RequestServlet", urlPatterns = {"/RequestServlet"})
public class RequestServlet extends HttpServlet {
 
    private static final long serialVersionUID = -1915463532411657451L;
 
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException 
    {
         
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         
        String username = request.getParameter("username");
        String password = request.getParameter("password");
         
        boolean success = validateUser(username, password);
         
        try {
            // Write some content
            username.equals("Shrek");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>LoginServlet</title>");
            out.println("</head>");
            out.println("<body>");
     
            if(success) {
                out.println("<h2>Welcome "+username+"</h2>");
            }else{
                out.println("<h2>Validate your self again.</h2>");
            }
             
            out.println("</body>");
            out.println("</html>");
        } catch (NullPointerException e) {
            out.println("<img src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTXq9cQ_q4N5N6cd4ggvZlXh4hGyDX6z58YjMmDweK03yPxjGg_JZ2Sa_XI7kU&s' heigth=50% width=100%></img>");
        }
        out.close();
    }

    public boolean validateUser(String username, String password) {
        /*if (username.equals("Shrek") && password.equals("islove")) return true;
        else return false; cursed para poder aplicar um XSS*/
        return true;
    }
}
