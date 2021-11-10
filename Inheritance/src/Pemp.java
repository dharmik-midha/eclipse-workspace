import java.io.*;

class Emp {
	String x;
	int age;
	String des;

	Emp() {
		x = "unknown";
		age = 0;
		des = "unknown";
	}

	Emp(String x1, int age1, String d) {
		x = x1;
		age = age1;
		des = d;
	}
}

class Pemp extends Emp {
	float salary;

	public Pemp() {
		super();
		salary = 0;
		System.out.println("name is " + x + " age is " + age + " designation is " + des + " salaryis " + salary);
	}

	Pemp(String n, int a, String designation, float s) {
		super(n, a, designation);
		salary = s;
		System.out.println("name is " + x + " age is " + age + " designation is " + des + " salaryis " + salary);
	}

	float get_salary() {
		return salary;
	}

	void set_salary(float xsalary) {
		salary = xsalary;
	}

	void printPemp() {
		System.out.println("salary " + salary);
	}

	void display() {
		System.out.println("name " + x + " age is " + age + " designation is " + des + " salary is " + salary);
	}

	public static void main(String arg[]) {
		Pemp p = new Pemp("john", 28, "trainer", 20000);
		Pemp p1 = new Pemp();
		p.get_salary();
		p.printPemp();
		p1.set_salary(45000);
		p1.printPemp();
		p1.display();
		p.display();
	}
}
