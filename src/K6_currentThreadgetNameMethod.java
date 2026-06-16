public class K6_currentThreadgetNameMethod {
    public static void main(String[]args){

        System.out.println("Hello");

        // currentThread() + getName() to know which thread is currently executing
        System.out.println(Thread.currentThread().getName());

        // currentThread() + setName() to set the name of current Thread
        Thread.currentThread().setName("Lemon Thread");

        System.out.println(Thread.currentThread().getName());

        //this exception below is only being generated to see the name of thread in the system/JVM? generated message for exception
        System.out.println(10/0);  // Exception in thread "Lemon Thread" ........


    }
}
