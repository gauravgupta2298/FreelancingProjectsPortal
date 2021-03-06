<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style.css" rel="stylesheet" type="text/css" />
        <title>Main Page</title>
    </head>
    <body><center>
        <%
            String fname=(String)session.getAttribute("fname");
            if(fname==null || fname.trim().equals(""))
            {
               response.sendRedirect("home.jsp");
               return; //to avoid 'HTTP Status 500 - An exception occurred processing JSP page', as java code after this line shouldn't be excuted.
            }
        %>
        <div class="heading">
            Freelancing Projects Portal (FPP)
        </div>
        <div class="options">
            <center><br><a href="freelancerHome.jsp">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="browseCategories.jsp">Browse Project Categories</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="aboutUs.jsp">About us</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="contactUs.jsp">Contact us</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="logout.jsp">Logout</a>
            </center>
        </div>
        <h1>Welcome <%=fname%>!</h1><br/>
        <div style="font-size: 20px">
            <a href="browseCategories.jsp">Search Projects</a><br/><br/><br/>
            <a href="">Chats</a><br/><br/><br/>
        </div>
        </center>
    </body>
</html>
