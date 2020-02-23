/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.EmployerDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.EmployerLoginAuthenticator;

/**
 *
 * @author Gaurav
 */
public class EmployerLoginChecker extends HttpServlet 
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("home.jsp");
    }  
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String ename= request.getParameter("ename");
        String epassword= request.getParameter("epassword");
        
        EmployerDTO employer=new EmployerDTO();
        employer.setEname(ename);
        employer.setEpassword(epassword);
        
        EmployerLoginAuthenticator authenticator=new EmployerLoginAuthenticator();
        Boolean login=authenticator.isLogin(employer);
        
        if(login)
        {
            HttpSession session=request.getSession(true);
            session.setAttribute("ename", ename);
            response.sendRedirect("employerHome.jsp");
        }
        else
        {
            response.sendRedirect("home.jsp");
        }
    }
}
