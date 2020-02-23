/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dto.EmployerDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gaurav
 */
public class EmployerSignupAuthenticator 
{
    public boolean isSignup(EmployerDTO employer)
    {
        String ename=employer.getEname();
        String epassword=employer.getEpassword();
        String company=employer.getCompany();
        String email=employer.getEmail();
        String phone=employer.getPhone();
        String city=employer.getCity();
        
        try
        {
            Statement st=DBConnector.getStatement();
            String query="SELECT ename FROM employer WHERE ename='"+ename+"'";//checking if username is already registered.         
            ResultSet rs=st.executeQuery(query);
            if(rs.next())
            {
                return false; //returing false is username is already registered.
            }              
            query="INSERT INTO employer(ename,epassword,company,email,phone,city) VALUES('"+ename.trim()+"','"+epassword+"','"+company.trim()+"','"+email.trim()+"','"+phone+"','"+city.trim()+"')";            
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
