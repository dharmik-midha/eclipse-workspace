package TCP;
import java.io.*;
import java.net.*;
import java.util.*;
public class serverexample {
	//server side
	  public static void main(String arg[])
	  {
	     try{
	     
		 Socket s;
		 ServerSocket ss =new ServerSocket(8000);
		 System.out.println("serverstarted");
		  s=ss.accept();
		  
		  System.out.println("request accepted");
		  PrintStream ps=new PrintStream(s.getOutputStream());
		  ps.println("Enter a name");
		  BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			 
		  String name=br.readLine();
		  ps.println("Hello "+name);
		  ss.close();
	     }
	     catch(Exception e)
	     {
	    	 System.out.println(e);
	     }
	    }
	  }
