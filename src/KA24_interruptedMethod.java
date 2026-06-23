class test15 extends Thread
{
    public void run()
    {
        System.out.println(Thread.interrupted());  // this will set the interrupt flag: true -> false

        try{
            for(int i=1;i<=5;i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
public class KA24_interruptedMethod {
    public static void main(String[]args){

        test15 t1 = new test15();
        t1.start();
        t1.interrupt();

    }
}


/*

= System.out.println(Thread.interrupted());
This is a static method.
It checks the interrupt status of the currently executing thread (t1).
Since the flag is true, it prints: true
* and the it also clears the flag.  true -> false
Now the interrupt flag becomes: Interrupt Flag = false.

When execution reaches: Thread.sleep(1000);
Since the interrupt flag has already been cleared: Interrupt Flag = false;
there is no interruption, so sleep() executes normally.


 */