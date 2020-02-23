<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="dto.ProjectDTO"%>
<%@page import="dao.ProjectDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style.css" rel="stylesheet" type="text/css" />
        <title>Posted Adds</title>
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
        <%
            ProjectDTO project= new ProjectDTO();
            project.setEmpname(ename);
            ProjectDAO projectDAO=new ProjectDAO();
            List<ProjectDTO> listOfProjects= projectDAO.getEmpProjects(project);
            Iterator<ProjectDTO> listIterator= listOfProjects.iterator();
        %>
        <table border="1" style="width: 800px">
            <tr>
                    <td><B>Category:</B></td>
                    <td><B>Details:</B></td>
            </tr>
        <%
            while(listIterator.hasNext())
            {
                ProjectDTO projectDTO=listIterator.next();
        %>
                <tr>
                    <td><%=projectDTO.getCategory()%></td>
                    <td><%=projectDTO.getDetails()%></td>
                </tr>
        <%
            }
        %>
        </table>
        </center>
    </body>
</html>
