import java.rmi.*;  
import java.rmi.registry.*;  
public class RMIServer{  
public static void main(String args[]){  
try{  
Multiply stub=new MultiplierRemote();  
Naming.rebind("rmi://localhost/Dharmik",stub);  
}catch(Exception e){System.out.println(e);}  
}  
}  
