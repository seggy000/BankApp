/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.managedbeans;

import java.io.Serializable;
import ch.hearc.ig.odi.business.Customer;
import ch.hearc.ig.odi.services.Services;
import java.util.List;
import javax.ejb.Stateful;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Details du client
 *
 * @author thoma
 */
@Stateful
@SessionScoped
@Named(value = "customerDetailsBean")
public class CustomerDetailsBean implements Serializable {

    @Inject
    Services services;

    private int number;
    private String firstname;
    private String lastname;
    private List accounts;

    /**
     * Creates a new instance of CustomerDetailsBean
     */
    public CustomerDetailsBean() {
    }

    public int initCustomer(int number) {
        this.number = number;
        Customer customer = services.getCustomer(number);
        this.firstname = customer.getFirstName();
        this.lastname = customer.getLastName();
        this.accounts = customer.getAccounts();
        if (number > 0) {
            return 0;
        } else {
            return 1;
        }
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

    public List getAccounts() {
        return accounts;
    }

}
