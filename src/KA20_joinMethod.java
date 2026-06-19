class test12 extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i+" Child Thread: "+getName()+" ");
            try{
                sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class KA20_joinMethod {
    public static void main(String[]args) throws InterruptedException{

        test12 t = new test12();  // A thread Object created
        t.start();                // child thread started
        t.join();                 // Main thread waits until thread t finishes its execution.
        try{
            for(int i=1;i<=5;i++){
                System.out.println("Calling Thread: "+Thread.currentThread().getName()+"; "+i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
