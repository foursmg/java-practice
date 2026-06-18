class test6 extends Thread
{
    public void run()
    {
        System.out.println("This is child Thread");
        System.out.println("Child Thread Priority:"+ Thread.currentThread().getPriority());
    }
}
public class KA13_setPriority {
    public static void main(String[]args){

        //checking priority of main thread, it will return default (5), since priority hasn't been set by programmer
        System.out.println("Main Thread PriorityX: "+ Thread.currentThread().getPriority());

        //setting priority of maain thread
        Thread.currentThread().setPriority(7);

        //checking priority of main thread again after setting priority
        System.out.println("Main Thread PriorityY: "+ Thread.currentThread().getPriority());

        test6 t1 = new test6();
        t1.start();
    }
}
