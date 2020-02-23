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
import model.EmployerSignupAuthenticator;

/**
 *
 * @author Gaurav
 */
public class EmployerSignupChecker extends HttpServlet 
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("home.jsp");
    }  
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String ename= request.getParameter("ename");
        String epassword= request.getParameter("epassword");
        String cpassword= request.getParameter("cpassword");
        String company= request.getParameter("company");
        String email=request.getParameter("email");
        String phone= request.getParameter("phone");
        String city= request.getParameter("city");
        
        if(ename.isEmpty() || company.isEmpty() || email.isEmpty() || phone.isEmpty()|| city.isEmpty() || epassword.isEmpty() || !epassword.equals(cpassword))
        {
            response.sendRedirect("signupFail.jsp"); 
            return;//to avoid 'HTTP Status 500 - cannot call sendRedirect() after the response has been commited', as we have multiple sendRedirect on one page.
        }
        
        EmployerDTO employer=new EmployerDTO();
        employer.setEname(ename);
        employer.setEpassword(epassword);
        employer.setCompany(company);
        employer.setEmail(email);
        employer.setPhone(phone);
        employer.setCity(city);
        
        EmployerSignupAuthenticator authenticator=new EmployerSignupAuthenticator();
        Boolean signup= authenticator.isSignup(employer);
        
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
