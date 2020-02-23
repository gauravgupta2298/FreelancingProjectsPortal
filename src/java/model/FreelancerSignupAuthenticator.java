/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dto.FreelancerDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gaurav
 */
public class FreelancerSignupAuthenticator 
{
    public boolean isSignup(FreelancerDTO freelancer)
    {
        String fname=freelancer.getFname();
        String fpassword=freelancer.getFpassword();
        String fullname=freelancer.getFullname();
        String email=freelancer.getEmail();
        String age=freelancer.getAge();
        String phone=freelancer.getPhone();
        String city=freelancer.getCity();
        
        try
        {
            Statement st=DBConnector.getStatement();
            String query="SELECT fname FROM freelancer WHERE fname='"+fname+"'";//checking if username is already registered.         
            ResultSet rs=st.executeQuery(query);
            if(rs.next())
            {
                return false; //returing false is username is already registered.
            }      
            query="INSERT INTO freelancer(fname,fpassword,fullname,email,age,phone,city) VALUES('"+fname.trim()+"','"+fpassword+"','"+fullname.trim()+"','"+email.trim()+"','"+age+"','"+phone+"','"+city.trim()+"')";
            int i=st.executeUpdate(query); //inserting data to database as user is new.
            if(i>0)
            {
                return true;
            }
            else
            {
                return false; 
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return false;
    }
}
