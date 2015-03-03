<%-- 
    Document   : newjsp
    Created on : 16/09/2014, 05:40:50 PM
    Author     : Enrique Moreno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
        <h1>Hello World!</h1>
        <table border="1">
            <tr>
                <td>
                    a*b=c
                    
                </td>
            </tr>
            
      <%
        for(int i=1; i<=10;i++){
        out.println("<tr><td>"+1+"*"+i+"="+1*i+"</td></tr>");
        }
        
        %>
      
    
    

  
</table>
        
        
        
        
        
    </body>
</html>
