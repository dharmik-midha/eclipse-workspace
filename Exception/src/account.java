import java.io.*;

 	class BalanceNotSufficientException extends Exception 
 	{
	
 		int r_amount;
	
	BalanceNotSufficientException(int a)
	{
		r_amount=a;
	}
	
	public String toString() 
	{
		return("the exception occured because withdrawl amount is "+r_amount+"");
	}
 	}
 	class account{
	String name ;
	int acc_no ;
	int deposit;
	
	public account(String n,int ac,int d) {
		name=n;
		acc_no=ac;
		deposit=d;
		}
	
	void b_deposit(int am) 
	{ deposit+=am;	}
	
	void b_withdrawl(int wm ) throws BalanceNotSufficientException
	{ 
		int temp=deposit-wm;
		if(temp<1000)
		{
			throw new BalanceNotSufficientException(temp);
		}
		else
		{	
			deposit=temp;
			
		}
	}
	void balance() {System.out.println("new balance is "+deposit);}
	public static void main(String arg[]) 
	{  account a =new account("dharmik midha",3959,2500);
	try {
			a.b_deposit(500);
			a.balance();
			a.b_withdrawl(2500);
			a.balance();
		} 
		catch (BalanceNotSufficientException e) 
		{
			
			System.out.println(e);
		}
		
	}
}
