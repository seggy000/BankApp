package ch.hearc.ig.odi.business;

import java.util.Collection;


public class Customer {

	Collection<Account> accounts;
	private int number;
	private String firstName;
	private String lastName;

        
	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

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
	}

	/**
	 * 
	 * @param number
     * @return
	 */
	public Account getAccountByNumber(String number) {
            return null;
	}

	/**
	 * 
	 * @param number
	 * @param name
	 * @param rate
	 */
	public void addAccount(String number, String name, double rate) {
		this.accounts.add(new Account(number, name, rate, this));
	}

}