class test17 extends Thread
{
    public void run()
    {
        System.out.println("isInterrupted A1: "+Thread.currentThread().isInterrupted());
        System.out.println("interrupted: "+Thread.interrupted());  // this will set the interrupt flag: true -> false
        System.out.println("isInterrupted A2: "+Thread.currentThread().isInterrupted());
        try{
            for(int i=1;i<=5;i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
public class KA26_isInterruptedMethod {
    public static void main(String[]args){

        test17 t1 = new test17();
        t1.start();
        t1.interrupt();  // if this line is removed both interrupted and isInterrupted will return: false;

    }
}