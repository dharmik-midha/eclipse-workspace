import java.io.*;

interface varconstants {
	final static double pi = 3.14;
	final static double radius = 5.7;
	final static double height = 8;
}

class circle implements varconstants {
	double circumference() {
		return 2 * pi * radius;
	}

	double area() {
		return pi * radius * radius;
	}

	public static void main(String arg[]) {
		circle c = new circle();
		System.out.println("area is " + c.area());
		System.out.println("circumference is " + c.circumference());
	}
}
