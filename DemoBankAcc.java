import java.util.*;
class BankAccount
{
	private String name,acc_type;
	private int acc_no;
	
	private double balance;
	
	public void initial(String name,int acc_no, String acc_type,double balance)
	{
		this.name=name;
		this.acc_no=acc_no;
		this.acc_type=acc_type;
		this.balance=balance;
	}
	public void deposit(double c)
	{
		balance=balance+c;
	}
	public void withdraw(double c)
	{
		if(balance<c)
		{
			System.out.println("Withdraw amount larger than balance");
		}
		else
		{
			balance=balance-c;
		}
	}
	public void display()
	{
		System.out.println("Name="+name);
		System.out.println("Balance amount="+balance);
	}
}

public class DemoBankAcc
{
	public static void main (String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name of Account Holder:");
		String n=sc.nextLine();
		System.out.println("Enter the Account number:");
		int an=sc.nextInt();
		System.out.println("Enter the Account type: ");
		String at=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the INitial balance:");
		double d=sc.nextDouble();
		BankAccount b=new BankAccount();
		b.initial(n,an,at,d);
		b.deposit(5000);
		b.withdraw(500);
		b.display();
		
	}
}