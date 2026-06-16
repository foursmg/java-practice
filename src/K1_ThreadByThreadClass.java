//Creating a thread extending Thread Class

// 1. Extend the Thread class
class MyThread extends Thread
{
    // 2. Override the run() method
    @Override
    public void run(){
        System.out.println("Thread is running...");
    }

}


public class K1_ThreadByThreadClass {
    public static void main(String[]args){

        // 3. create an Object of MyThread
        MyThread t1 = new MyThread();

        // 4. Start the thread  // Invoke the thread
        t1.start();

        //t1.start();   // this will throw IllegalThreadStateException
                        //ref comment
    }
}


/*

A thread can be started only once
After a thread finishes execution, it enters Terminated(Dead) state and cannot be restarted.

To run Again create a new Thread Object:
MyThread t2 = new MyThread();
t2.start();


 */