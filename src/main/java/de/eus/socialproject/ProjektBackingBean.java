/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.eus.socialproject;

import de.eus.dao.DaoInterface;
import de.eus.dao.ProjektDAO;
import de.eus.entities.Projekt;
import java.io.Serializable;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Emmi
 */
@Named
@Stateless
public class ProjektBackingBean {

    private String email;
    private String name;
    private String projektname;
    private String projektidee;
    private String ort;
    private String zeitraum;
    private String tags;

    
    
    public String speichern() throws NamingException {
        System.out.println("speichern() wurde aufgerufen");
        
        // TODO Oliver Soll innerhalb des Kontextes injeziert werden.
        DaoInterface projektDao = (DaoInterface) new InitialContext().lookup("java:module/ProjektDAO");

     // Es handelt sich um ein neues Projekt, so
        Projekt projekt = new Projekt();
        projekt.setEmail(email);
        projekt.setName(name);
        
        System.out.println(projekt);
        projektDao.speichern(projekt);
        
        // gehe zur Seite zurueck (bleibe auf der Seite)
        return "erstelle";
    }

    
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
    
    public String getTags() {
        return tags;
    }
    
     public void setTags(String tags) {
        
        this.tags = tags;
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
