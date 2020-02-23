<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="dao.ProjectDAO"%>
<%@page import="dto.ProjectDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
        <link href="style.css" rel="stylesheet" type="text/css" />
        <title>Browse Project Categories</title>
    </head>
    <body>
        <%
            String fname=(String)session.getAttribute("fname");
            String ename=(String)session.getAttribute("ename");
            if(fname==null && ename==null)
            {
               response.sendRedirect("home.jsp");
               return; //to avoid 'HTTP Status 500 - An exception occurred processing JSP page', as java code after this line shouldn't be excuted.
            }
        %>
        <div class="heading">
            <center>Freelancing Projects Portal (FPP)</center>
        </div>
        <div class="options">
            <center><br><a href="home.jsp">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="browseCategories.jsp">Browse Project Categories</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="aboutUs.jsp">About us</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="contactUs.jsp">Contact us</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="logout.jsp">Logout</a>
            </center>
        </div>
        <center></br></br></br>
        <div style="font-size: 20px">
            <form action="browseCategories.jsp">
                <td>Select Category:</td>
                <td><select name="category">
                    <option value="none">---Select---</option> 
                    <option>Website</option>
                    <option>Video Editing</option>
                    <option>App Development</option>
                    </select>
                </td>
                <input type="submit" value="Submit">
            </form></br></br>
        <%
            ProjectDTO project= new ProjectDTO();
            String category= request.getParameter("category");
            project.setCategory(category);
            ProjectDAO projectDAO=new ProjectDAO();
            List<ProjectDTO> listOfProjects= projectDAO.getCatProjects(project);
            Iterator<ProjectDTO> listIterator= listOfProjects.iterator();
        %>
        Category: <%=project.getCategory()%>
        <table border="1" style="width: 800px">
            <tr>
                    <td><B>Employer:</B></td>
                    <td><B>Details:</B></td>
            </tr>
        <%
            while(listIterator.hasNext())
            {
                ProjectDTO projectDTO=listIterator.next();
        %>
                <tr>
                    <td><%=projectDTO.getEmpname()%></td>
                    <td><%=projectDTO.getDetails()%></td>
                </tr>
        <%
            }
        %>
        </table>
        </div>
        </center>
    </body>
</html>
