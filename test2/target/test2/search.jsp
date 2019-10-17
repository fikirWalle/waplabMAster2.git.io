<%@ page import="java.util.*" %>
<html>
<head>
</head>
<body>

<br><br><br><br><br><br>
<table width="700px" align="center"
       style="border:1px solid #000000;">
    <tr>
        <td colspan=8 align="center"
            style="background-color:yellow">
            <b>Word Glosery</b></td>
    </tr>
    <tr style="background-color:black;">
        <td><b>Name</b></td>
        <td><b>type</b></td>
        <td><b>Example</b></td>


    </tr>
    <%
        int count=0;
      String color;


        if(request.getAttribute("words")!=null)
        {
            ArrayList al = (ArrayList)request.getAttribute("words");
            Iterator itr = al.iterator();


            while(itr.hasNext()){

                if((count%2)==0){
                    color = "#eeffee";
                }
                else{
                    color = "#F9EBB3";
                }
                count++;
                ArrayList words = (ArrayList)itr.next();
    %>
    <tr style="background-color:<%=color%>;">
        <td><%=words.get(0)%></td>
        <td><%=words.get(1)%></td>
        <td><%=words.get(2)%></td>
    </tr>
    <%
            }
        }
    %>
    <%
        if(count==0){
    %>
    <tr>
        <td colspan=8 align="center"
            style="background-color:eeffee"><b>No Record</b></td>
    </tr>
    <%
        }
    %>
</table>



</body>