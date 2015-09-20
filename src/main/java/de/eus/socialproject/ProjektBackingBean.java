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
    private String name;
    private String projektname;
    private String projektidee;
    private String ort;
    private String zeitraum;

    public String getName() {
        return name;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProjektname() {
        return projektname;
    }

    public void setProjektname(String projektname) {
        this.projektname = projektname;
    }

    public String getProjektidee() {
        return projektidee;
    }

    public void setProjektidee(String projektidee) {
        
        this.projektidee = projektidee;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getZeitraum() {
        return zeitraum;
    }

    public void setZeitraum(String zeitraum) {
        this.zeitraum = zeitraum;
    }

    public String getEmail() {
        return email;
    }

    public String submit() {
        System.out.println(email);
        setEmail(null);
        return "Emmi";

    }
}
