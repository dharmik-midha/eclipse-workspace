class Point {
	int x, y;

	// selector and mutator
	int getx() {
		return x;
	} // selector

	int gety() {
		return y;
	} // selector

	void setx(int newValue) {
		x = newValue;
	} // mutator

	void sety(int newValue) {
		y = newValue;
	} // mutator

	Point() {
		x = y = 0;
	};

	Point(int a, int b) {
		x = a;
		y = b;
	}

	void print() {
		System.out.println("value of x =" + x + "\nvalue of y =" + y); // same function with different implementation
	}
}

//   overriden
class PointOverriding extends Point {
	int z;

	PointOverriding() {
		z = 0;
	}

	PointOverriding(int a, int b, int c) {
		super(a, b);
		z = c;
	}

	// selector and mutator
	int getz() {
		return z;
	}// selector

	void setz(int newValue) {
		z = newValue;
	}// mutator

	void print() {
		super.print();
		System.out.println("value of z =" + z); // same function with different implementation
	}

	// main class
	public static void main(String arg[]) {
		PointOverriding t = new PointOverriding();
		PointOverriding t1 = new PointOverriding(20, 30, 40);
		t.print();
		t1.print();
	}
}
