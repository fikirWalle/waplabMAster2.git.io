import com.sun.deploy.net.HttpRequest;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



public class indexcontroller extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

           int first=(Integer.parseInt(req.getParameter("num1"))) ;
           int second=(Integer.parseInt(req.getParameter("num2"))) ;

            int answer=first+second;

        PrintWriter out=resp.getWriter();
          out.print(answer);

    }
}
