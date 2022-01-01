package tenth_task;

import java.util.Date;
import java.util.ArrayList;

public class Account {
	private int id=0;//’À∫≈
	private double balance=0;//±Ì æ”‡∂Ó
	private double annualInterestRate=0;
	private Date dateCreated = new Date();
	private String name;
	private ArrayList<Transaction> transaction = new ArrayList<>();
	

	public void Account() {
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id; 
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getRate() {
		return annualInterestRate;
	}
	public void setRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		double monthlyInterestRate = annualInterestRate / 12;
		return monthlyInterestRate;
	}
	public double getMonthlyInterest() {
		double monthlyInterestRate = annualInterestRate / 12;
		return balance * monthlyInterestRate / 100;
	}
	public void withDraw(double x) {
		balance = balance - x;
		Transaction t = new Transaction('W',x,balance);
		transaction.add(t);
	}
	public void deposit(int x) {
		balance = balance + x;
		Transaction t = new Transaction('D',x,balance);
		transaction.add(t);
	}
	public Account(String name , int id , double balance) {
		this.name=name;
		this.id = id;
		this.balance = balance;
	}
	
	public ArrayList getList() {
		return transaction;
	}
}
class Transaction{
	private Date date = new Date();
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	public Transaction(char c, double x, double balance2) {
		// TODO Auto-generated constructor stub
		this.type = c;
		this.amount = x;
		this.balance = balance2;
	}
}
