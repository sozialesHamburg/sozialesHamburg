/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.eus.socialproject;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
/**
 *
 * @author Emmi
 */
@Named 
@SessionScoped 

public class ProjektBackingBean implements Serializable {
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
     public String submit(){
     System.out.println(email);
     setEmail(null);
     return "Emmi";
    
 }  
}
