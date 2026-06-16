class myThread1 extends Thread
{
    @Override
    public void run(){
        System.out.println("Task 1 is executing...");
    }
}

class myThread2 extends Thread
{
    @Override
    public void run(){
        System.out.println("Task 2 is executing...");
    }
}

class myThread3 extends Thread
{
    @Override
    public void run(){
        System.out.println("Task 3 is executing...");
    }
}


public class K5_MultipleTaskMultipleThread {
    public static void main(String[]args){

        myThread1 t1 = new myThread1();
        t1.start();

        myThread2 t2 = new myThread2();
        t2.start();

        myThread3 t3 = new myThread3();
        t3.start();

    }
}
