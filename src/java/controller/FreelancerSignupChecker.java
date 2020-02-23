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
import model.FreelancerSignupAuthenticator;

/**
 *
 * @author Gaurav
 */
public class FreelancerSignupChecker extends HttpServlet 
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("home.jsp");
    }  
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String fname= request.getParameter("fname");
        String fpassword= request.getParameter("fpassword");
        String cpassword= request.getParameter("cpassword");
        String fullname= request.getParameter("fullname");
        String email=request.getParameter("email");
        String age= request.getParameter("age");
        String phone= request.getParameter("phone");
        String city= request.getParameter("city");
        
        if(fname.isEmpty() || fullname.isEmpty() || email.isEmpty() || age.isEmpty() || phone.isEmpty()|| city.isEmpty() || fpassword.isEmpty() || !fpassword.equals(cpassword))
        {
            response.sendRedirect("signupFail.jsp"); 
            return;//to avoid 'HTTP Status 500 - cannot call sendRedirect() after the response has been commited', as we have multiple sendRedirect on one page.
        }
        
        FreelancerDTO freelancer=new FreelancerDTO();
        freelancer.setFname(fname);
        freelancer.setFpassword(fpassword);
        freelancer.setFullname(fullname);
        freelancer.setEmail(email);
        freelancer.setPhone(phone);
        freelancer.setCity(city);
        freelancer.setAge(age);
        
        FreelancerSignupAuthenticator authenticator=new FreelancerSignupAuthenticator();
        Boolean signup= authenticator.isSignup(freelancer);
        
        if(signup)
        {
            response.sendRedirect("home.jsp");
        }
        else
        {
            response.sendRedirect("signupFail.jsp");
        }
    }
}
