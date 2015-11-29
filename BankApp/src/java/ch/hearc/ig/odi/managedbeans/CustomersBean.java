/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.managedbeans;

import ch.hearc.ig.odi.services.Services;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author thoma
 */
@Stateless
@Named(value = "customersBean")
public class CustomersBean implements Serializable {

    /**
     * Creates a new instance of CustomerBean
     */
    @Inject
    Services services;

    public CustomersBean() {
    }

    
    public List getCustomers() {
        return services.getCustomersList();
    }

}
