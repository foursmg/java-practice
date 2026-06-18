class test3 extends Thread
{
    public void run()
    {
        System.out.println("Child thread.");
        System.out.println(Thread.currentThread().isDaemon());
    }

}
public class KA10_UserThread {
    public static void main(String[]args){

        test3 t1 = new test3();
        t1.start();
    }
}

//Because every newly created thread inherits the daemon status of its parent.
// The parent here is the main thread, which is a user thread.