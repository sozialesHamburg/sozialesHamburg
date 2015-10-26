/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.eus.dao;

import de.eus.entities.Projekt;
import javax.ejb.Local;


/**
 *
 * @author Oliver
 */
@Local
public interface DaoInterface {
    
    public void speichern(Projekt projekt);
    
}
