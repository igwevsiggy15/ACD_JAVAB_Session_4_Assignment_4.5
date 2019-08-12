package Assignment5;

import java.util.Scanner;

public class TestAccount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int accNo;
		String accName;
		String accBal;
		double rate;
		
//		System.out.print("Enter Savings account number: ");
		accNo = scanInt(sc, "Enter Savings account number: ");
//		System.out.print("Enter Savings account name: ");
		accName = scanString(sc, "Enter Savings account name: ");
//		System.out.print("Enter Savings account balance: ");
		accBal = scanString(sc, "Enter Savings account balance: ");
//		System.out.print("Enter Savings account rate: ");
		rate = scanDouble(sc, "Enter Savings account rate: ");
		
		Saving save = new Saving(accNo, accName, accBal, rate);
		
		System.out.println();
		
//		System.out.print("Enter current account number: ");
		accNo = scanInt(sc, "Enter current account number: ");
//		System.out.print("Enter current account name: ");
		accName = scanString(sc, "Enter current account name: ");
//		System.out.print("Enter current account balance: ");
		accBal = scanString(sc, "Enter current account balance: ");
//		System.out.print("Enter current account rate: ");
		rate = scanDouble(sc, "Enter current account rate: ");
		
		Current curr = new Current(accNo, accName, accBal, rate);
		
		System.out.println("\n" + save + "\n");
		System.out.println(curr);
		
		sc.close();
	}
	static int scanInt(Scanner sc, String prompt) {
		int num = 0;
		boolean pass = false;
		while (!pass) {
			System.out.print(prompt);
			try {
				num = sc.nextInt();
				pass = true;
			} catch(Exception e){
				System.out.println("Input must be a number.");
			}
			if (sc.hasNextLine()) sc.nextLine();
		}
		return num;
	}
	
	static Double scanDouble(Scanner sc, String prompt) {
		double num = 0;
		boolean pass = false;
		while (!pass) {
			System.out.print(prompt);
			try {
				num = sc.nextDouble();
				pass = true;
			} catch(Exception e){
				System.out.println("Input must be a number.");
			}
			if (sc.hasNextLine()) sc.nextLine();
		}
		return num;
	}
	
	static String scanString(Scanner sc, String prompt) {
		String s = "";
		boolean pass = false;
		while (!pass) {
			System.out.print(prompt);
			try {
				s = sc.nextLine();
				if(s.length() < 1) {
					System.out.println("Input cannot be empty.");
					continue;
				}
				return s;
			} catch(Exception e){
				System.out.println("Input must be a string.");
			}
		}
		return null;
	}
}
class Account{
	private int accNo;
	private String accName;
	private String accBal;
	
	public Account(int accNo, String accName, String accBal) {
		this.accNo = accNo;
		this.accName = accName;
		this.accBal = accBal;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccBal() {
		return accBal;
	}

	public void setAccBal(String accBal) {
		this.accBal = accBal;
	}
	
	
}

class Saving extends Account{
	private double rateOfInt;
	
	public Saving(int accNo, String accName, String accBal, double rateOfInt) {
		super(accNo, accName, accBal);
		this.rateOfInt = rateOfInt;
	}

	public double getRateOfInt() {
		return rateOfInt;
	}

	public void setRateOfInt(double rateOfInt) {
		this.rateOfInt = rateOfInt;
	}
	
	@Override
	public String toString() {
		return "Savings Account:"
				+ "\nAccount Number: " + getAccNo() 
				+ "\nAccount Name: " + getAccName()
				+ "\nAccount Balance: " + getAccBal()
				+ "\nInterest rate: " + rateOfInt;
	}
}

class Current extends Account{
	private double rateOfInt;
	
	public Current(int accNo, String accName, String accBal, double rateOfInt) {
		super(accNo, accName, accBal);
		this.rateOfInt = rateOfInt;
	}

	public double getRateOfInt() {
		return rateOfInt;
	}

	public void setRateOfInt(double rateOfInt) {
		this.rateOfInt = rateOfInt;
	}

	@Override
	public String toString() {
		return "Current Account:"
				+ "\nAccount Number: " + getAccNo() 
				+ "\nAccount Name: " + getAccName()
				+ "\nAccount Balance: " + getAccBal()
				+ "\nInterest rate: " + rateOfInt;
	}
	
	
}