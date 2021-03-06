package DataInputOutputStream;

import java.io.*;

public class DataStreamExample {
	public static void main(String arg[]) {
		try {

			DataOutputStream dos = new DataOutputStream(
					new FileOutputStream("C:\\Users\\dharm\\Desktop\\Example\\DataOutputStream.txt"));
			dos.writeDouble(9.87);
			; // to write double value
			dos.writeBoolean(true); // to write boolean value
			dos.writeInt(1000); // to write integer value
			dos.close();
			DataInputStream dis = new DataInputStream(
					new FileInputStream("C:\\Users\\dharm\\Desktop\\Example\\DataOutputStream.txt"));
			System.out.println(dis.readDouble()); // to read double value
			System.out.println(dis.readBoolean()); // to read boolean value
			System.out.println(dis.readInt()); // to read integer value
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
