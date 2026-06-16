// Creating a thread using the Runnable interface

// 1. Implement the Runnable interface
class MyRunnable implements Runnable
{
    // 2. Override the run() method
    // This method contains the task to be executed by the thread
    @Override
    public void run(){
        System.out.println("My Runnable Thread is running.....");
    }
}

public class K2_ThreadByRunnableInterface {
    public static void main(String[]args){

        // 3. Creating an Object of Runnable Implementation class
        MyRunnable r = new MyRunnable();

        // 4. Pass the Runnable Object to a Thread Object
        Thread t1 = new Thread(r);

        // 5. Start the thread
        t1.start();
    }
}
