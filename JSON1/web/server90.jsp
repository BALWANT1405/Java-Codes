<%-- 
    Document   : server
    Created on : Feb 7, 2017, 12:30:28 PM
    Author     : Bsb
--%>

<%@page import="org.json.simple.JSONObject"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="application/json; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <%
         try
         {
     JSONObject ob=new JSONObject();
     
     String a=request.getParameter("v1");
     Class.forName("com.mysql.jdbc.Driver");
     Connection co=DriverManager.getConnection("jdbc:mysql://localhost/virtuoso","root","aaron");
     Statement st=co.createStatement();
     ResultSet rs=st.executeQuery("select * from json_table where first_key='"+a+"'");
     while(rs.next())
     {
         String a1= rs.getString(1);
         String a2= rs.getString(2);
         ob.put(a1,a2);
     }
     out.print(ob);
         }
         catch(Exception e)
         {
         out.println(e);    
         }
     %>
    </body>
</html>
