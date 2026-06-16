//2. Performing single task from multiple thread.
class MYThread extends Thread
{
    @Override
    public void run(){
        System.out.println("Single task Multiple thread is being executed.");
    }

}

public class K4_SingleTaskMultipleThread {
    public static void main(String[]args){     // main thread

        MyThread t1 = new MyThread();  // child thread T1
        t1.start();

        MyThread t2 = new MyThread();  // child thread T2
        t2.start();
    }
}

//Total Thread in this Program: 1 main thread, 2 child thread -> 3 Threads