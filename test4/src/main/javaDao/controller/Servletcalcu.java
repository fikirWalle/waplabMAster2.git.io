package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Servletcalcu extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter pw=resp.getWriter();
        resp.setContentType("text/html");


        String add1=req.getParameter("add1");//it must be the same with html add input name
        String add2=req.getParameter("add2");
        String multi1=req.getParameter("multi1");
        String multi2=req.getParameter("multi2");

        if(!add1.equals("")&& !add2.equals("")){

            int sum=Integer.valueOf(add1)+Integer.valueOf(add2);
            pw.println("  <input type=\"text\" name=\"add1\" value=\""+add1+"\"> + " +
                    "<input type=\"text\" name=\"add2\" value=\""+add2+"\"> = " +
                    "<input type=\"text\" name=\"sum\" value=\""+sum+"\">");


        }
        else{
            pw.println("  <input type=\"text\" name=\"add1\" value=\"\"> + <input type=\"text\" name=\"add2\" value=\"\"> = <input type=\"text\" name=\"sum\">");

        }
        pw.println("</br>");
        if(!multi1.equals("")&& !multi2.equals("")){

            int product=Integer.valueOf(multi1)*Integer.valueOf(multi2);
            pw.println("  <input type=\"text\" name=\"multi1\" value=\""+multi1+"\"> * <input type=\"text\" name=\"multi2\" value=\""+multi2+"\"> = <input type=\"text\" name=\"product\" value=\""+product+"\">");
        }
        else{
            pw.println("  <input type=\"text\" name=\"multi1\" value=\"\"> + <input type=\"text\" name=\"multi2\" value=\"\"> = <input type=\"text\" name=\"product\">");

        }
    }


    }



