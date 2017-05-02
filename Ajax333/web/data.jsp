        <%
        int a=Integer.parseInt(request.getParameter("v1"));
        int b=Integer.parseInt(request.getParameter("v2"));
        int c=(a+b);
        out.println(c);
        %>