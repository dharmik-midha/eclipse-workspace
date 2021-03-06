package FileInputStream;

import java.io.*;

public class FileReadFunction {

	/*
	 * Q.create a file aplhabet.txt which contains abc, we need to determine no. of
	 * bytes available for reading , we read 5 bytes using byte at a time method ,
	 * we read the next 5 bytes in an array with one read we again calculate the no.
	 * of bytes available for reading, we then use the skip method to skip 5
	 * bytes,we read the remaining bytes in one go into a byte array and display the
	 * output to std.output.
	 */

	public static void main(String arg[]) {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\dharm\\Desktop\\Example\\Alphabet.txt");

			int c = fis.available();
			System.out.println("total bytes available : " + c);
			byte b[] = new byte[5];
			for (int i = 0; i < 5; i++) {
				fis.read(b, 0, 1);
				String s = new String(b);
				System.out.println(s);// read 5 byte
			}
			byte b1[] = new byte[5];
			fis.read(b1); // read another 5 byte
			String s1 = new String(b1);
			System.out.println("Another 5 character : " + s1);
			fis.skip(5); // skip 5 byte
			int x = fis.available(); // 11 byte remaining
			byte b2[] = new byte[x];
			fis.read(b2);
			String s2 = new String(b2);
			System.out.println("Remaining character : " + s2);
		}

		catch (IOException e) {
			System.out.println("IOexception" + e);
		}

	}
}
