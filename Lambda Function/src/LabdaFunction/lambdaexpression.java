package LabdaFunction;
import java.io.*;

interface moneychanger{ void rupeetodollar(int rupee);}

class lambdaexpression {
 public static void main(String arg[])
{ 
  moneychanger mc=(ruppee)->{	System.out.println("In dollars "+ruppee*70); };
	mc.rupeetodollar(14);
 }
}
