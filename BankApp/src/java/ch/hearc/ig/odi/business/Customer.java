package ch.hearc.ig.odi.business;

import java.util.*;
/**
 * Classe Client
 * @author thoma
 */
public class Customer {

    private List<Account> accounts;
    private int number;
    private String firstName;
    private String lastName;

    /**
     *
     * @param number
     * @param firstName
     * @param lastName
     */
    public Customer(Integer number, String firstName, String lastName) {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new ArrayList<>();
    }

    /**
     *
     * @param number
     * @return 
     */
    public Account getAccountByNumber(String number) {
        Account account = null;
        boolean found = false;
        int i = 0;
        while (!found && i <= accounts.size()) {
            if (accounts.get(i).getNumber().equals(number)) {
                found = true;
                account = accounts.get(i);
            }
        }
        if (!found) {
            throw new IllegalArgumentException("This account doesn't exist");
        }
        return account;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
}