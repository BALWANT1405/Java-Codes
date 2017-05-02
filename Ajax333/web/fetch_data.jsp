<%-- 
    Document   : data1
    Created on : Jan 19, 2017, 2:59:49 PM
    Author     : Bsb
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        <table align="center" bordercolor="green" border="4" cellpadding="2" cellspacing="5" bgcolor="red" width="250" height="250">
        <tr>
            <th>
                Name
            </th>
            <th>
                Subject
            </th>
            <th>
                Marks
            </th>
        </tr>
        
        
        <%
        Class.forName("com.mysql.jdbc.Driver");
        Connection co=DriverManager.getConnection("jdbc:mysql://localhost/database333","root","");
        Statement s=co.createStatement();
        String s1=request.getParameter("v1");
        
        ResultSet rs=s.executeQuery("Select * from student where Name='"+s1+"'");
        while(rs.next())
        {
        String s2=rs.getString(1);
        String s3=rs.getString(2);
        String s4=rs.getString(3);
       
        %>
        
        <tr>
            <td><%out.print(s2);%></td>
            <td><%out.print(s3);%></td>
            <td><%out.print(s4);%></td>
        </tr>      
      
        <%
        }
        %>
     
        
        </table>
    </body>
</html>
