package ThreadSynchronization;
class Callme
{
    synchronized void call(String msg)
    {
        System.out.print("["+msg);
        try
        {  Thread.sleep(900); } 
        catch (Exception e) 
        {System.out.println("Thread Woken up"); }
        System.out.println("]");
    }

}
class Caller implements Runnable
{
    String name;
    Thread t;
    Callme targs;
    Caller(Callme targs1,String n)
    {   t=new Thread(this);
        targs=targs1;
        name=n;
        t.start();
    }
    public void run()
    { targs.call(name); }
}

public class synchronization {
    public static void main(String[] args) {
        Callme target=new Callme();
        Caller ob1=new Caller(target,"Hello");
        Caller ob2=new Caller(target,"World"); 
    }
    
}
