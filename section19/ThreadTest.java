package section19;


class MyThread extends Thread
{
    @Override
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
}
class MyRunnable implements Runnable
{
    @Override
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
}
public class ThreadTest 
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
    
    public static void main(String[] args) {
        
     MyThread t=new MyThread();
       ThreadTest t1=new ThreadTest();
        MyRunnable t2=new MyRunnable();
        Thread th=new Thread(t);
        
        th.start();
        
        int i=1;
        while(true)
        {
            System.out.println(i+"World");
        }
        
    }
    
}