import java.io.*;

class StringFunc {
	public static void main(String args[]) {
		String S1 = "Hello";
		String S2 = "Hello";
		System.out.println("Strings Compare " + S1.compareTo(S2));
		System.out.println("String Length " + S1.length());
		System.out.println("String starts with He: " + S1.startsWith("He"));
		System.out.println("Substring : " + S1.substring(0, 3));
		String S5 = "    Helooello";
		System.out.println("Removes whitespace " + S5.trim());
		System.out.println("String to upper case: " + S1.toUpperCase());
		System.out.println("String to lower case: " + S2.toLowerCase());
		System.out.println("String Comparision without case : " + S1.equalsIgnoreCase(S2));
		String S3 = String.join(" ", "Hello", "world");
		System.out.println("String Join " + S3);
		System.out.println("String Get character :" + S3.charAt(2));
		byte b[] = { 65, 66, 67, 68 };
		char c[] = { 'h', 'e', 'l', 'l', 'o' };
		String a = new String(b);
		String a1 = new String(b, 0, 2);
		System.out.println(a);
		System.out.println(a1);
		String s = new String(c);
		String s1 = new String(c, 0, 4);
		char c1[] = new char[s.length()];
		c1 = s.toCharArray();
		char c2[] = new char[s1.length()];
		c2 = s1.toCharArray();
		System.out.println(c2);
		byte[] b1 = new byte[a.length()];
		a.getBytes();
	}
}
