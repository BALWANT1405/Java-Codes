<%-- 
    Document   : cleint90
    Created on : Feb 7, 2017, 2:35:28 PM
    Author     : Bsb
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
        <script>
            function load()
            {
                
                var b=document.getElementById("t1").value;
                var h=new XMLHttpRequest();
               
                h.onreadystatechange=function()
                {
                    
                    if(this.readyState==4 && this.status==200)
                    {
                        
                        document.getElementById("abc").innerHTML=this.responseText;
                    }
                     
                };
              
                h.open("GET","server90.jsp?v1="+b,true);    
               
                h.send();         
    }
        </script>
       </head>
    <body>
        <center><h1>FETCHING RECORDS USING AJAX</h1></center>
        
        
         <input type="text" name="t3" id="t1"/>
        <button type="button" id="b1" onclick="load()">FETCH RECORDS</button>
        <div id="abc">
           
        </div>
    </body>
</html>
