package LambdaFunctionWithMultiParameter;
import java.io.*;
interface interest{ void simpleinterest(int p,int r,int t);}  
  
public class interestcalculator{  
    public static void main(String[] args) 
    {
        interest i=(p,r,t)->{System.out.println("Simple interest "+p*r*t*100);
        };
    i.simpleinterest(2,4,6);
}
}
