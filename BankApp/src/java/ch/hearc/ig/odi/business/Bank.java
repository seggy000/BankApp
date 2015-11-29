/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.business;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe Banque
 * 
 * @author thoma
 */


public class Bank {

    int number;
    String name;
    Map<Integer, Customer> customers;
    Map<String, Account> accounts;

    /**
     *
     * @param number
     * @param name
     */
    public Bank(int number, String name) {
        this.number = number;
        this.name = name;

        customers = new HashMap();
        accounts = new HashMap();
    }

    public Map getCustomers() {
        return customers;
    }

    public Map getAccounts() {
        return accounts;
    }

    public Account getAccountByNumber(String number) {
        return accounts.get(number);
    }

    public Customer getCustomerByNumber(int number) {
        return customers.get(number);
    }

    public Customer addCustomer(int number, String firstName, String lastName) {
        Customer customer = new Customer(number, firstName, lastName);
        customers.put(number, customer);
        return customer;
    }

    public Account addAccount(String number, String name, double rate, Customer customer) {
        Account account = new Account(number, name, rate, customer);
        accounts.put(number, account);
        customer.addAccount(account);
        return account;
    }
}
