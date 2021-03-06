package ThreadUsingImplement;
class MyThreadClass implements Runnable {
	String x, y;
	Thread t;

	MyThreadClass(String a1, String b1, String s) {
		t = new Thread(this, s);
		x = a1;
		y = b1;
		t.start();
	}

	public void run() {

		if (Thread.currentThread().getName().equals("Child1"))
			System.out.println("equals: " + (x.equals(y)));
		else
			System.out.println("==: " + (x == y));
	}
}

public class MultiThreadStringImplement {
	public static void main(String[] args) {
		String a = "hello", b = "hello";
		String s1 = "Child1";
		String s2 = "Child2";
		new MyThreadClass(a, b, s1);
		new MyThreadClass(a, b, s2);
		System.out.println("I'm the main process.");
		System.out.println("compareTo: " + (a.compareTo(b)));
	}
}
