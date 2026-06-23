class test16 extends Thread
{
    public void run()
    {
        System.out.println("A: "+Thread.interrupted());
        System.out.println("A: "+Thread.interrupted());
        try{
            for(int i=1;i<=5;i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
                System.out.println("B: "+Thread.interrupted());
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
public class KA25_interruptedMethod2 {
    public static void main(String[]args){

        test16 t1 = new test16();
        t1.start();
        t1.interrupt();

    }
}

/*

On first:  System.out.println("A: "+Thread.interrupted());
it returns: true
after that it returns false even on checking multiple time
BECAUSE nothing interrupts the thread again.

On first call Thread.interrupted() returns:
true
and the flag is set to false : true -> false

on Second call and so on Thread.interrupted() returns: false
Flag stays false.



 */