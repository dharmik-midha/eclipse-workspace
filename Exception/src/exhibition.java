import java.io.*;
/*Design a execption class called heightnotsufficientexception In the heart of the city delhi ,dwarka inth exhibition ground an exhibition consisting of shops rides etc has been organised there are number of rides big and small some of the rides which are big require that a percent height should be minimum of 1meter to participate in ride the exception is thrown if the rider does not have the ride hence he has denied the participation else he is allowed to participate.
*/

class HeightNotSufficientException extends Exception {
	int R_Height;

	HeightNotSufficientException(int h1) {
		R_Height = h1;
	}

	public String toString() {
		return ("person is not eligible for ride cause of height " + R_Height);
	}
}

class AgeNotSufficientException extends Exception {
	int R_Age;

	AgeNotSufficientException(int a1) {
		R_Age = a1;
	}

	public String toString() {
		return ("person is not eligible for ride cause of age " + R_Age);
	}
}

public class exhibition {
	String Name;
	int Age;
	int Height;

	exhibition(String n, int a, int h) {
		Name = n;
		Age = a;
		Height = h;
	}

	void BigRide() throws HeightNotSufficientException, AgeNotSufficientException {
		if (Height >= 100 && Age >= 18) {
			System.out.println("person is eligible for big ride ");
		} else {
			if (Height < 100) {
				throw new HeightNotSufficientException(Height);
			} else {
				throw new AgeNotSufficientException(Age);
			}

		}

	}

	void SmallRide() throws HeightNotSufficientException, AgeNotSufficientException {
		if (Height >= 50 && Age >= 12) {
			System.out.println("person is eligible for small ride ");
		} else {
			if (Height < 50) {
				throw new HeightNotSufficientException(Height);
			} else {
				throw new AgeNotSufficientException(Age);
			}

		}

	}

	public static void main(String arg[]) {
		exhibition e = new exhibition("raju", 12, 100);
		try {
			e.BigRide();
			e.SmallRide();
		} catch (HeightNotSufficientException | AgeNotSufficientException E) {
			System.out.println("exception " + E);
		}
	}

}
