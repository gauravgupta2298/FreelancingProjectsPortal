/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.FreelancerDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.FreelancerLoginAuthenticator;

/**
 *
 * @author Gaurav
 */
public class FreelancerLoginChecker extends HttpServlet 
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("home.jsp");
    }  
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String fname= request.getParameter("fname");
        String fpassword= request.getParameter("fpassword");
        
        FreelancerDTO freelancer=new FreelancerDTO();
        freelancer.setFname(fname);
        freelancer.setFpassword(fpassword);
        
        FreelancerLoginAuthenticator authenticator=new FreelancerLoginAuthenticator();
        Boolean login=authenticator.isLogin(freelancer);
        
        if(login)
        {
            HttpSession session=request.getSession(true);
            session.setAttribute("fname", fname);
            response.sendRedirect("freelancerHome.jsp");
        }
        else
        {
            response.sendRedirect("home.jsp");
        }
    }
}
