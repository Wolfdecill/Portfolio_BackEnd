/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import Classes.PersonalDetails;
import Classes.Project;
import Connection.DBManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PortfolioDAO_Implementation implements PortfolioDAO_Interface {
    
    @Override
    public PersonalDetails getPerson() {
        try {
            return getPersonalDetails();    
        } catch (SQLException ex) {
            PersonalDetails person=new PersonalDetails();
            person.setName("SQLException");
            return person;
        }
    }
    
    private PersonalDetails getPersonalDetails() throws SQLException{
        // Getting all connection to Database Set Up  
      Connection connection = DBManager.getConn();
      PreparedStatement st=null;
      ResultSet rs=null;
      
      //Querry for database
      String query="Select * from user";
        
      //Other Set Up    
      PersonalDetails person= new PersonalDetails();
      
      //Connecting to database  
      st=connection.prepareCall(query);
      rs=st.executeQuery();
        if (rs.next()) {
         person.setName(rs.getString(2));
        person.setSurname(rs.getString(3));
        person.setAboutSelf(rs.getString(4));
        person.setJobStatus(rs.getBoolean(5));
        person.setProjects(getProjects());   
        }
        return person;
    }
    private List<Project> getProjects() {
      // Getting all connection to Database Set Up  
      Connection connection = DBManager.getConn();
      PreparedStatement st=null;
      ResultSet rs=null;
      
      //Querry for database
      String query="Select * from projects";
        
      //Other Set Up
      List<Project> projects= new ArrayList<>();
      
      try {
            st = connection.prepareStatement(query);
            rs=st.executeQuery();
            while(rs.next()){
                Project project=new Project();
                project.setName(rs.getString(2));
                project.setUrl(rs.getString(3));
                project.setDescription(rs.getString(4));
                projects.add(project);
                
            }
            return projects;
        } 
        catch (SQLException ex) {         
            return projects;
        }         
      
      finally{
          try {
              rs.close();
          } catch (SQLException ex) {
              Logger.getLogger(PortfolioDAO_Implementation.class.getName()).log(Level.SEVERE, "Probelm closing ResultSet in getProjects()", "ResultSet Close Problem");
          }
          try {
              st.close();
          } catch (SQLException ex) {
              Logger.getLogger(PortfolioDAO_Implementation.class.getName()).log(Level.SEVERE, "Probelm closing PreparedStatement in getProjects()", "PreparedStatement Close Problem");
          }
          try {
              connection.close();
          } catch (SQLException ex) {
              Logger.getLogger(PortfolioDAO_Implementation.class.getName()).log(Level.SEVERE, "Probelm closing connection in getProjects()", "Connection Close Problem");
          }
        }

    }
    
     

}
