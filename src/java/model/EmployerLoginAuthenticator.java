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
public class EmployerLoginAuthenticator 
{
    public boolean isLogin(EmployerDTO employer)
    {
        String ename=employer.getEname();
        String epassword=employer.getEpassword();
        
        String tablePassword="";
        try
        {
            Statement st=DBConnector.getStatement();
            String query="SELECT epassword FROM employer WHERE ename='"+ename.trim()+"'";            
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
        
        if(epassword.equals(tablePassword))
        {
            return true;
        }
        return false;
    }
    
}
