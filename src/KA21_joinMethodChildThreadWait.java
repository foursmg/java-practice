class test13 extends Thread
{
    static Thread mainthread;
    public void run()
    {
        try{
            mainthread.join();
            for(int i=1;i<=5;i++)
            {
                System.out.println("Child Thread: "+i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
public class KA21_joinMethodChildThreadWait {
    public static void main(String[]args){

        test13.mainthread = Thread.currentThread();

        test13 t1 = new test13();
        t1.start();

        try{
            for(int i=1;i<=5;i++){
                System.out.println("Main Thread: "+ i);
                Thread.sleep(1000);
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
