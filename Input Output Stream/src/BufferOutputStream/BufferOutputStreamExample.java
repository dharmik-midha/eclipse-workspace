package BufferOutputStream;

import java.io.*;

public class BufferOutputStreamExample {

	public static void main(String arg[]) {

		try {
			String s = "This is an Example of BufferOutputStream";
			byte b[] = s.getBytes();

			FileOutputStream fos = new FileOutputStream("C:\\Users\\dharm\\Desktop\\Example\\BufferOutputStream.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			bos.write(b);
			bos.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
