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
public class FreelancerLoginAuthenticator 
{
    public boolean isLogin(FreelancerDTO freelancer)
    {
        String fname=freelancer.getFname();
        String fpassword=freelancer.getFpassword();
        
        String tablePassword="";
        try
        {
            Statement st=DBConnector.getStatement();
            String query="SELECT fpassword FROM freelancer WHERE fname='"+fname.trim()+"'";            
            ResultSet rs=st.executeQuery(query);
            if(rs.next())
            {
                tablePassword=rs.getString(1);
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
        
        if(fpassword.equals(tablePassword))
        {
            return true;
        }
        return false;
    }
}
