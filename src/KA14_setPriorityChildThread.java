class test7 extends Thread
{
    public void run()
    {
        System.out.println("This is child Thread");
        System.out.println("Child Thread Priority:"+ Thread.currentThread().getPriority());
    }
}
public class KA14_setPriorityChildThread {
    public static void main(String[]args){


        System.out.println("Main Thread PriorityX: "+ Thread.currentThread().getPriority());

        //setting priority of main thread
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);   //Using Constant instead of int value(1-10)

        //checking priority of main thread again after setting priority
        System.out.println("Main Thread PriorityY: "+ Thread.currentThread().getPriority());

        test7 t1 = new test7();
        t1.setPriority(Thread.MIN_PRIORITY);  //Setting child thread priority after creating child thread object
        t1.start();
    }
}
