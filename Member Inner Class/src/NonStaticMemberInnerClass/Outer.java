package NonStaticMemberInnerClass;

import java.io.*;

//memberinnerexample
class Outer {
	private int data = 30;

	class Inner {
		void msg() {
			System.out.println(data);
			System.out.println("this is an example of member inner join class");
		}
	}

	public static void main(String arg[]) {
		Outer obj = new Outer();
		Outer.Inner in = obj.new Inner();
		in.msg();
	}
}
