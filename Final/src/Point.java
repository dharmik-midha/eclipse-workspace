import java.io.*;
//final class can't be inherit
final public class Point {
	int x;
	int y;

	public void set_x(int x1) {
		x = x1;
	}

	public void set_y(int y1) {
		y = y1;
	}

	int getx_() {
		return x;
	}

	int gety_() {
		return y;
	}

	public void display() {
		System.out.println("values of x " + x + " value of y " + y);
	}

	Point() {
		x = y = 0;
	}

	Point(int x1, int y1) {
		x = x1;
		y = y1;
	}

	Point(int y2) {
		x = 10;
		y = y2;
	}

	public static void main(String arg[]) {
		Point p = new Point();
		Point p1 = new Point(25, 35);
		Point p2 = new Point(40);
		p.display();
		p1.display();
		p2.display();
	}
}
