package ObjectInputOutputStream;
import java.io.*;
import java.util.*;
public class ObjectInputStreamExample {
    public static void main(String arg[]) 
    {
	try {
		
	ObjectInputStream ois= new ObjectInputStream(new FileInputStream("C:\\Users\\dharm\\Desktop\\Example\\ObjectStream.txt"));
	Point p=(Point)ois.readObject();
	System.out.println(p);
	ois.close();
	}
	catch(Exception e) 
	{System.out.println(e);	}
}
}
