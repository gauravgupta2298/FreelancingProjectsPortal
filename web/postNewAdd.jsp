<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style.css" rel="stylesheet" type="text/css" />
        <title>Post New Add</title>
    </head>
    <body><center>
        <%
            String ename=(String)session.getAttribute("ename");
            if(ename==null || ename.trim().equals(""))
            {
               response.sendRedirect("home.jsp");
               return; //to avoid 'HTTP Status 500 - An exception occurred processing JSP page', as java code after this line shouldn't be excuted.
            }
        %>
        <div class="heading">
            Freelancing Projects Portal (FPP)
        </div>
        <div class="options">
            <center><br><a href="employerHome.jsp">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="browseCategories.jsp">Browse Project Categories</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="aboutUs.jsp">About us</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="contactUs.jsp">Contact us</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="logout.jsp">Logout</a>
            </center>
        </div>
        <h1>Welcome <%=ename%>!</h1><br/>
        <b>Fill the details below and click on post-</b><br/><br/>
        <form action="PostNewAdd" method="post">
            <table>
                    <tr>
                        <td>Select Category:</td>
                        <td><select name="category">
                                <option>Website</option>
                                <option>Video Editing</option>
                                <option>App Development</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Project Description:</td>
                        <td><input type="text" name="details" placeholder="Enter Description Here" style="width:200px; height:100px"></td>
                    </tr>
                    <tr>
                        <td><input type="text" name="ename" value="<%=ename%>" hidden="hidden"></td>
                        <td><input type="submit" value="Post"></td>
                    </tr>
                    </table>
        </form>
        </center>
    </body>
</html>

