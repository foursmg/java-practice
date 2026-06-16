import java.lang.reflect.Method;

class Test1 extends Thread
{
    public void run()
    {
        //2nd way of setting the name of child thread, inside child thread itself.
        //Thread.currentThread().setName("MethodABC"); // if we set name of this thread using this
                                                     // we don't need to use t1.setName("...");  in main method
        System.out.println("Video playing....");
        System.out.println(Thread.currentThread().getName());  //since we have setting thread name ourselves, it will return that custom name
    }
}
public class K8_childThreadgetNameSetName {
    public static void main(String[]args){

        System.out.println("this thread: "+Thread.currentThread().getName());

        Test1 t1 = new Test1();

        // 1st way the set name of child thread, inside main method.  (use only 1st or 2nd method not both)
        //setting the name of thread using .setName("..");
        t1.setName("MethodXYZ");  //if we using this method to set the name of child thread
                                  // don't need to use : Thread.currentThread().setName("..."); in child thread task

        t1.start();

    }
}
