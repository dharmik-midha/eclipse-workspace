import java.io.*;

abstract class shape // abstract class
{
	int side;

	shape(int s) {
		side = s;
		System.out.println(" side is " + side); // abstract class can have non-abstract classes
	}

	abstract void area();

	abstract void parameter();
// abstract method does not have implementation in abstract class it will be available in sub-class
}

public class square extends shape {
	int side1;

	square(int s1, int s2) {
		super(s1);
		side1 = s2;
	};

	void area() // abstract method area
	{
		System.out.println(" Area of Square is " + side1 * side1);
	}

	void parameter() // abstract method parameter
	{
		System.out.println(" Parameter of Square is " + 4 * side1);
	}

	public static void main(String arg[]) {
		shape sh;
		square sq = new square(20, 30);
		sh = sq;
		sq.area();
		sq.parameter();
	}
}
