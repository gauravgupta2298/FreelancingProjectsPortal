/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dto.ProjectDTO;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gaurav
 */
public class PostNewAddAuthenticator 
{
    public void postAdd(ProjectDTO project)
    {
        String category= project.getCategory();
        String details= project.getDetails();
        String empname= project.getEmpname();
        
        try
        {
            Statement st=DBConnector.getStatement();
            String query="INSERT INTO project(category,empname,details) VALUES('"+category+"','"+empname+"','"+details+"')";                        
            st.executeUpdate(query); //inserting data into database.
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
}
