import java.io.*;
class ThrowDemo{

static void demopro() throws NullPointerException //throws
{
	try{
		throw new NullPointerException("demo"); //throw
		}
	catch(NullPointerException e)
{
	System.out.println("i caught");
	 throw e;
}
}
	public static void main(String arg[]) 
	{
		try {
			 demopro();
		}
		catch(Exception e)
		{	
			System.out.println("insidemain "+e);
		}
			
	}
}
