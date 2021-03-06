import java.io.*;

public class PointStatic {
	int x;
	int y;
	static int count;

	// mutators
	void set_x(int x1) {
		x = x1;
	}

	void set_y(int y1) {
		y = y1;
	}

	// selectors
	static int get_count() {
		return count;
	}

	int getx_() {
		return x;
	}

	int gety_() {
		return y;
	}

	PointStatic() {
		x = y = 0;
		count++;
	}

	PointStatic(int x1, int y1) {
		x = x1;
		y = y1;
		count++;
	}

	PointStatic(int y2) {
		x = 10;
		y = y2;
		count++;
	}

	public void display() {
		System.out.println("values of x " + x + " value of y " + y);
	}

	public static void main(String arg[]) {
		PointStatic p=new PointStatic();
		PointStatic p1=new PointStatic(25,35);
		PointStatic p2=new PointStatic(40);
		p.display();
		p1.display();
		p2.display();			
		System.out.println("total no. of object: "+get_count());
		}
}
