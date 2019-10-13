package org.sdibt.entity;

public class Account {
	private String accountName;
	private String accountPassword;
	private double balance;
	
	public Account() {
		super();
	}
	public Account(String accountName, String accountPassword, double balance) {
		super();
		this.accountName = accountName;
		this.accountPassword = accountPassword;
		this.balance = balance;
	}
	public void depositor(double money) {
		balance+=money;
		System.out.println("存款成功！\n当前账户余额为"+balance+"元！");
	}
	public void withdraw(double money) {
		if(balance-money>=0) {
			balance-=money;
			System.out.println("取款成功！\n当前账户余额为"+balance+"元！");
		}
		else {
			System.out.println("账户余额不足！");
		}
	}
}
