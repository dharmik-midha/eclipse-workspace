package ByteArrayInputStream;
import java.io.*;

public class ByteArrayInputStreamProgram {

		public static void main(String arg[]){

		String s="Hello world";
		byte b[]=s.getBytes();
		ByteArrayInputStream bais=new ByteArrayInputStream(b);
		for (int i=0;i<b.length;i++)
		{
			char c=(char) bais.read();
			char c1=Character.toUpperCase(c);	//convert into upper string
			System.out.println(c1);
		}
	 }
}
