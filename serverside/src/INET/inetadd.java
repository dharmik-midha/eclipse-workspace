package INET;

import java.net.InetAddress;
import java.io.*;

public class inetadd {

	public static void main(String arg[]) {
		try {
			InetAddress add = InetAddress.getLocalHost(); // InetAddress getLocalHost( )
			System.out.println(add);
			add = InetAddress.getByName("lbsim.ac.in"); // InetAddress getByName(String hostName)
			System.out.println(add);
			InetAddress a[] = InetAddress.getAllByName("starware.com"); // InetAddress[ ] getAllByName(String hostName)
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
			InetAddress a1[] = InetAddress.getAllByName("microsoft.com"); // InetAddress[ ] getAllByName(String
																			// hostName)
			for (int i = 0; i < a1.length; i++) {
				System.out.println(a1[i]);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
