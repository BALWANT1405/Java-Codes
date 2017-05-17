<%-- 
    Document   : data
    Created on : Jan 18, 2017, 5:40:40 PM
    Author     : Bsb
--%>

<%@page import="java.util.ArrayList"%>
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
        <h1>INFORMATION SHOWN BELOW:</h1>
        
        <%
     
     ArrayList<String> ar=new ArrayList<String>();
                  
     Class.forName("com.mysql.jdbc.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost/database","root","");
     Statement s=con.createStatement();
     
     String str=request.getParameter("n1");
       

     ResultSet rs=s.executeQuery("select * from student1 where Name='"+str+"'");
     
     while(rs.next())
     {
         
         String s1=rs.getString(1);
         String s2=rs.getString(2);
         String s3=rs.getString(3);
         String s4=rs.getString(4);

         //out.println(s1+"</br>"+s2+"</br>"+s3+"</br>"+s4);
         
         ar.add(s1);
         ar.add(s2);
         ar.add(s3);
         ar.add(s4);
         
         
     }
     for(String s9:ar)
     {
        out.println(s9);
     }





        %>
        
        
        
    </body>
</html>
