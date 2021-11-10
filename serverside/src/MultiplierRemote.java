import java.rmi.*;
import java.rmi.server.*;

public class MultiplierRemote extends UnicastRemoteObject implements Multiply {
	MultiplierRemote() throws RemoteException {
		super();
	}

	public int Multiply(int x, int y) {
		return x + y;
	}
}

