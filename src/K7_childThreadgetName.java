class test extends Thread
{
    public void run()
    {
        //Thread.currentThread().setName("MyThread1"); // if using this for setting the name of thread
                                                    // No need to use t1.setName(""); in main method
        System.out.println("Task is executing....");
        System.out.println("This thread is: "+Thread.currentThread().getName());
    }
}
public class K7_childThreadgetName {
    public static void main(String[]args){

        //creating an object of class test
        test t1 = new test();
        // invoking the thread
        t1.start();  // This thread is: Thread-0

        //creating a second object of class test and invoking the task again
        test t2 = new test();
        t2.start(); //  This thread is: Thread-0

        // This currentThread().getName() is for main method thread checking
        System.out.println("Hello: "+Thread.currentThread().getName());
    }
}
