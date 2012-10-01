<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*,com.sjsu.mybus.model.Bus"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
    <head>
        <title>JPA Guest Book Web Application Tutorial</title>
    </head>
 
    <body>
 
        <hr><ol> <%
            @SuppressWarnings("unchecked") 
            List<Bus> busses = (List<Bus>)request.getAttribute("busses");
            if (busses != null) {
                for (Bus bus : busses) { %>
                    <li> <%= bus %> </li> <%
                }
            } %>
        </ol><hr>

     </body>
 </html>