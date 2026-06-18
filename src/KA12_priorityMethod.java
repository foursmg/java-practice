class test5 extends Thread
{
    public void run()
    {
        System.out.println("This is child Thread");
        System.out.println("Child Thread Priority:"+ Thread.currentThread().getPriority()); //since child thread inherit priority
                                                                                            //Output : 5
    }
}
public class KA12_priorityMethod {
    public static void main(String[]args){

        //checking priority of main thread, it will return default (5), since priority hasn't been set by programmer
        System.out.println("Main Thread Priority: "+ Thread.currentThread().getPriority());

        test5 t1 = new test5();
        t1.start();
    }
}
