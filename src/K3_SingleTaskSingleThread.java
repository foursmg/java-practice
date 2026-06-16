// 1. Performing single task from single thread
class Mythread extends Thread
{
    @Override
    public void run(){
        System.out.println("Single task is being executed.");
    }
}

public class K3_SingleTaskSingleThread {
    public static void main(String[]args){

        Mythread t = new Mythread();

        t.start();

    }
}


/*

public class Test extends Thread
{
     public void run()
     {
          System.out.println("Task 1");
     }

     public static void main(String[]args)
     {
          Test t1 = new Test();
          t1.start();
     }
}


 */