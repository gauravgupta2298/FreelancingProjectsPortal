/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBConnector;
import dto.ProjectDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gaurav
 */
public class ProjectDAO 
{
    public List<ProjectDTO> getEmpProjects(ProjectDTO project)
    {
        List<ProjectDTO> listOfProjects=new ArrayList<ProjectDTO>();
        String empname=project.getEmpname();
        try
        {
            Statement st=DBConnector.getStatement();
            String query="SELECT * FROM project where empname='"+empname+"'"; 
            ResultSet rs=st.executeQuery(query);
            
            while(rs.next())
            {
                ProjectDTO projectDTO= new ProjectDTO();
                projectDTO.setDetails(rs.getString(3));
                projectDTO.setCategory(rs.getString(4));
                listOfProjects.add(projectDTO);
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return listOfProjects;
    }
    
    public List<ProjectDTO> getCatProjects(ProjectDTO project)
    {
        List<ProjectDTO> listOfProjects=new ArrayList<ProjectDTO>();
        String category=project.getCategory();
        try
        {
            Statement st=DBConnector.getStatement();
            String query="SELECT * FROM project where category='"+category+"'"; 
            ResultSet rs=st.executeQuery(query);
            
            while(rs.next())
            {
                ProjectDTO projectDTO= new ProjectDTO();
                projectDTO.setEmpname(rs.getString(2));
                projectDTO.setDetails(rs.getString(3));
                listOfProjects.add(projectDTO);
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return listOfProjects;
    }
}
