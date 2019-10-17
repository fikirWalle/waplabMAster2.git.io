import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.sql.*;
import java.sql.*;
import java.util.*;

public class Search extends HttpServlet{

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException,IOException{
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//
//
//        Connection conn = null;
//        String url = "jdbc:mysql://localhost:3306/";
//        String dbName = "dictionary";
//        String driver = "com.mysql.jdbc.Driver";
//        String userName = "root";
//        String password = "root";
//
//    System.out.println("==================================================================================");
//        System.out.println("==================================================================================");
//        System.out.println("==================================================================================");
//
       try {
//            Class.forName(driver).newInstance();
//            conn = DriverManager.getConnection(url+dbName,userName,password);
//            System.out.println("Connected to the database");
//            String  foundword  = request.getParameter("wordname");
//
//            String query = "select * from wordstore where wordname = ? ";
//            PreparedStatement st = conn.prepareStatement(query);
//            st.setString(1,foundword);
//            ArrayList al=null;
//            ArrayList wordlist =new ArrayList();
//
//
//            System.out.println("query " + query);
//            ResultSet  rs = st.executeQuery();
//
//
//            while(rs.next()){
//                al  = new ArrayList();
//
//                al.add(rs.getString(1));
//                al.add(rs.getString(2));
//                al.add(rs.getString(3));
//
//                System.out.println("al :: "+al);
//                wordlist.add(al);
//            }
//
//            request.setAttribute("words",wordlist);
//
//            System.out.println("words " + wordlist);
//            System.out.println("words " + wordlist.get(0));
//            out.println("wordlist " + wordlist);
//
//
//           // String nextJSP = "search.jsp";
////            RequestDispatcher dispatcher =
////                    getServletContext().getRequestDispatcher(nextJSP);
////            dispatcher.forward(request,response);
//            response.sendRedirect("test3.jsp");
//            conn.close();
//            System.out.println("Disconnected from database");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}