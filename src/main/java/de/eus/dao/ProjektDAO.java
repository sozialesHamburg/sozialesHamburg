/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.eus.dao;

import de.eus.entities.Projekt;
import java.util.Iterator;
import java.util.Set;
import javax.ejb.Stateful;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 *
 * @author Oliver
 */
@Stateful
public class ProjektDAO implements DaoInterface {

    @PersistenceContext(unitName = "SozialesHamburgPU", type = PersistenceContextType.EXTENDED)
    private EntityManager entityManager;

    @Override
    public void speichern(Projekt projekt) {
        System.out.println("speichern() wurde gerufen");

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Projekt>> constraintViolations = validator.validate(projekt);
        if (constraintViolations.size() > 0) {
            Iterator<ConstraintViolation<Projekt>> iterator = constraintViolations.iterator();
            while (iterator.hasNext()) {
                ConstraintViolation<Projekt> cv = iterator.next();
                System.err.println(cv.getRootBeanClass().getName() + "." + cv.getPropertyPath() + " " + cv.getMessage());

                String message = cv.getRootBeanClass().getSimpleName() + "." + cv.getPropertyPath() + " " + cv.getMessage();
                FacesContext fc = FacesContext.getCurrentInstance();
                if (fc != null) {
                    fc.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, message, message));
                }

            }
        } else {
            entityManager.persist(projekt);
        }

        System.out.println("Das war's. Ich bin raus.");
    }
}
