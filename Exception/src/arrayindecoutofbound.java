import java.util.Scanner;

public class arrayindecoutofbound {
	public static void main(String arg[])
	{ 	int i,n;
	
//	System.out.println("how many elements ");
	Scanner s = new Scanner(System.in);
	//   n=s.nextInt();
	
	int a[]= new int[5];
	System.out.println("Enter 5 elements");
	try  
	{	//for input
		for(i=0;i<5;i++)	
	   {System.out .println("enter the no. "); a[i]=s.nextInt(); }
		
		//for output
		for(i=0;i<5;i++) 	
		{System.out.println(a[i]);}
		System.out.println(a[6]);	// array index out of boundary
	}
	
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Exception "+e);	
	}
	}

}
