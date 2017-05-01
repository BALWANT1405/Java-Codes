<%-- 
    Document   : String1
    Created on : Jan 13, 2017, 2:45:58 PM
    Author     : Bsb
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String s1=request.getParameter("name1");
        int i=Integer.parseInt(request.getParameter("div"));
        int k=s1.length();
        int l=k/i;
         
        /*
        out.println(s1);
        out.println(i);
        */
        
        for(int j=0;j<k;j=j+l)
        {
        out.print(s1.substring(j, Math.min(k,j+l)));
        out.print("</br>");
        }
        
        %>
    </body>
</html>
