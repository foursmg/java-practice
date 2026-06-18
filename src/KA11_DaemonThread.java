class test4 extends Thread
{
    public void run()
    {
        System.out.println("This is a child thread.");
        System.out.println(Thread.currentThread().isDaemon());
    }
}

public class KA11_DaemonThread {
    public static void main(String[]args){

        System.out.println("Helo....... ");

        test4 t1 = new test4();
        t1.setDaemon(true);
        t1.start();

    }
}
