package ThreadUsingImplement;
class MyThread implements Runnable {
	Thread t, t1;
	int x;
	int y;
	String s;

	MyThread(int a1, int b1, String s) {
		t = new Thread(this, s);
		x = a1;
		y = b1;
		t.start();
	}

	public void run() {

		if (t.getName().equals("child1")) {
			System.out.println("the sum is = " + (x + y));
		} else {
			System.out.println("the difference is = " + (x - y));
		}
	}
}

class MultiThreadAri {
	public static void main(String arg[]) {
		// Thread.currentThread().setPriority(2);

		int a = 10;
		int b = 5;
		new MyThread(a, b, "child1");
		new MyThread(a, b, "child2");
		System.out.println("the multiplication is = " + (a * b));
	}
}
