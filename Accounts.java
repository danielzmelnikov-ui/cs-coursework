/**
 * @(#)lab1.java
 *
 *
 * @author Daniel Melnikov
 * @version 1.00 2024/1/17
 */


public class Accounts
{
	private String Name;
	private String PhoneNumber;
	private double Balance;

	public Accounts()
	{
		Name = "";
		PhoneNumber = "";
		Balance = 0;
	}

	Accounts (String name, String phNumber)
	{
		Name = name;
		PhoneNumber = phNumber;
	}

	Accounts (String name, String phNumber, double balance)
	{
		Name = name;
		PhoneNumber = phNumber;
		Balance = balance;
	}

	public String getName()
	{
		return Name;
	}

	public String getPhoneNumber()
	{
		return PhoneNumber;
	}

	public double getBalance()
	{
		return Balance;
	}

	public void deposit(double value)
	{
		Balance = Balance + value;
	}

	public void withdraw(double value)
	{
		Balance = Balance - value;
	}

	public void changeName(String newName)
	{
		Name = newName;
	}

	public void changePhoneNumber(String newNumber)
	{
		PhoneNumber = newNumber;
	}

	public void changeBalance(double newBalance)
	{
		Balance = newBalance;
	}
}
