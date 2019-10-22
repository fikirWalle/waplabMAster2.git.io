import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.google.gson.Gson;

//@WebServlet(urlPatterns= {"/searchcontroller"})
public class searchcontroller extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "entries";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "root";


        try {

            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url + dbName, userName, password);
            System.out.println("Connected to the database");
            String foundword = request.getParameter("wordname");

            String query = "select * from entries where word = ? ";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, foundword);
            ArrayList al = null;
            ArrayList wordlist = new ArrayList();


            System.out.println("query " + query);
            ResultSet rs = st.executeQuery();


            while (rs.next()) {
                al = new ArrayList();

                al.add(rs.getString(1));
                al.add(rs.getString(2));
                al.add(rs.getString(3));


                System.out.println("al :: " + al);
                wordlist.add(al);
            }



            ///gson creation
            Gson gson = new Gson();
            String currBook = gson.toJson(wordlist);
            String mydictionary = gson.toJson(wordlist);

            System.out.println("Conversion to a JSON Object of words " + wordlist);


            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");

            response.getWriter().write(mydictionary);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}