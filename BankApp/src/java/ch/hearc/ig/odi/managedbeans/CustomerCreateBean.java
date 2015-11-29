/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.managedbeans;

import ch.hearc.ig.odi.services.Services;
import javax.ejb.Stateful;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Permet d'ajouter des clients.
 *
 * @author thoma
 */

@Stateful
@Named(value = "@customerCreateBean")
public class CustomerCreateBean {

    @Inject
    Services services;

    private int number;
    private String firstname;
    private String lastname;

    /**
     * Creates a new instance of CustomerCreateBean
     */
    public CustomerCreateBean() {
    }

    /**
     * Créer un client via Services
     * 
     * @return un code d'erreur, 0 si tout s'est bien déroulé
     */
    public int createCustomer() {
        services.saveCustomer(number, firstname, lastname);
        return 0;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}
