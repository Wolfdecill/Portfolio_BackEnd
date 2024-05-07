/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.List;

/**
 *
 * @author USER-PC
 */
public class PersonalDetails {
    private String name;
    private String surname;
    private String aboutSelf;
    private boolean jobStatus;
    private List<Project> projects;

    public PersonalDetails() {}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getSurname() {return surname;}

    public void setSurname(String surname) {this.surname = surname;}

    public String getAboutSelf() {return aboutSelf;}

    public void setAboutSelf(String aboutSelf) {this.aboutSelf = aboutSelf;}

    public boolean getJobStatus() {return jobStatus;}

    public void setJobStatus(boolean jobStatus) {this.jobStatus = jobStatus;}

    public List<Project> getProjects() {return projects;}

    public void setProjects(List<Project> projects) {this.projects = projects;}
    
    
    
    
}
