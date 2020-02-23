/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.ProjectDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.PostNewAddAuthenticator;

/**
 *
 * @author Gaurav
 */
public class PostNewAdd extends HttpServlet 
{
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("home.jsp");
    }  
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String category= request.getParameter("category");
        String details= request.getParameter("details");
        String empname= request.getParameter("ename");
        
        if(category.isEmpty() || details.isEmpty())
        {
            response.sendRedirect("freelancerHome.jsp"); return;
        }
        
        ProjectDTO project= new ProjectDTO();
        project.setCategory(category);
        project.setDetails(details);
        project.setEmpname(empname);
        
        PostNewAddAuthenticator authenticator=new PostNewAddAuthenticator();
        authenticator.postAdd(project);
        response.sendRedirect("freelancerHome.jsp");
    }
}
