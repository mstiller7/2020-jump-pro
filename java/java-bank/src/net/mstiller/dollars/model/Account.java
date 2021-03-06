package net.mstiller.dollars.model;

import java.util.ArrayList;

public class Account {
	
	public String name, address, phone;
	public String id;
	public String password;
	public int balance;
	public ArrayList<Transaction> transactions;
	
	public Account(String name, String address, String phone, String id, String password, int balance) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.id = id;
		this.password = password;
		this.balance = balance;
		this.transactions = new ArrayList<>();
	}
	
	public Transaction recordTransaction(Transaction t) {
		transactions.add(t);
		if (transactions.size() > 5) {
			transactions.remove(0);
		}
		return t;
	}
	
	@Override
	public String toString() {
		return "Customer Name: " + name +
		"\nCustomer Address: " + address +
		"\nCustomer Contact Number: " + phone +
		"\nUser ID: " + id;
//		"\nPassword: " + password;
	}
	
}
