import java.io.*;

interface mc {
	int dollartoruppee(int dollar);

	int ruppeetodollar(int ruppes);
}

class india implements mc {
	public int dollartoruppee(int dollar) {
		return dollar * 73;
	}

	public int ruppeetodollar(int ruppee) {
		return ruppee / 73;
	}
}

class pakistan implements mc {
	public int dollartoruppee(int dollar) {
		return dollar * 150;
	}

	public int ruppeetodollar(int ruppee) {
		return ruppee / 150;
	}
}

class nepal implements mc {
	public int dollartoruppee(int dollar) {
		return dollar * 115;
	}

	public int ruppeetodollar(int ruppee) {
		return ruppee / 115;
	}
}

public class moneyconverter {
	public static void main(String arg[]) {
		mc mc1;
		india i = new india();
		pakistan p = new pakistan();
		nepal n = new nepal();
		mc1 = i;
		System.out.println(mc1.dollartoruppee(1));
		mc1 = n;
		System.out.println(mc1.dollartoruppee(1));
		mc1 = p;
		System.out.println(mc1.dollartoruppee(1));
	}
}
