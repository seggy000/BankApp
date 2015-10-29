package ch.hearc.ig.odi.business;

public class Account {

	Customer customer;
	private String number;
	private String name;
	private double balance = 0;
	private double rate = 0.01;

	public String getNumber() {
		return this.number;
	}

	/**
	 * 
	 * @param number
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return this.balance;
	}

	/**
	 * 
	 * @param balance
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getRate() {
		return this.rate;
	}

	/**
	 * 
	 * @param rate
	 */
	public void setRate(double rate) {
		this.rate = rate;
	}

	/**
	 * 
	 * @param number
	 * @param name
	 * @param rate
	 * @param customer
	 */
	public Account(String number, String name, double rate, Customer customer) {
		this.number = number;
                this.name = name;
                this.rate = rate;
                this.customer = customer;
	}

	/**
	 * 
	 * @param amount
	 */
	public void credit(double amount) {
            if (amount > 1) {
                this.setBalance(this.getBalance() + amount);
            } else {
                System.out.println("erreur montant inférieur à 1");
            }
	}

	/**
	 * 
	 * @param amount
	 */
	public void debit(double amount) {
            if (amount > 1) {
                if (amount > this.getBalance()) {
                    this.setBalance(this.getBalance() - amount);
                } else {
                    System.out.println("erreur montant supérieur au solde actuel");
                }
            } else {
                System.out.println("erreur montant actuel inférieur a 1");
            }
	}

	/**
	 * 
	 * @param amount
	 * @param source
	 * @param target
	 */
	public static void transfert(double amount, Account source, Account target) {
		if (amount > 1) {
                if (amount > source.getBalance()) {
                    source.debit(amount);
                    target.credit(amount);
                } else {
                    System.out.println("erreur montant supérieur au solde actuel");
                }
            } else {
                System.out.println("erreur montant actuel inférieur a 1");
            }
	}
}