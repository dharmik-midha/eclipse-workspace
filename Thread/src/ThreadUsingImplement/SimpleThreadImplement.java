package ThreadUsingImplement;
import java.io.*;;

class MyThread1 implements Runnable {
	Thread t;
	int x;
	int y;

	static int priority = 5;

	MyThread1(int a1, int b1) {
		t = new Thread(this, "Childt");
		x = a1;
		y = b1;
		int p = Thread.currentThread().getPriority();
		t.setPriority(++p);
		t.start();
	}

	public void run() {
		System.out.println("sum is " + (x + y));
	}
}

class SimpleThreadImplement {
	public static void main(String arg[]) {
		Thread.currentThread().setPriority(2);
		int a = 10;
		int b = 5;
		new MyThread1(a, b);
		System.out.println("difference is " + (a - b));
	}
}
