class test11 extends Thread
{
    public void run()
    {
        //Thread.yield(); here also instead of using in main method
        for(int i=1;i<=5;i++){
            System.out.println(i + " - "+ getName() );
        }
    }
}
public class KA19_yield {
    public static void main(String[]args){

        test11 t1 = new test11();
        t1.start();

        Thread.yield();
        for(int i=0;i<=5;i++){
            System.out.println(i+" _ "+ Thread.currentThread().getName());
        }
    }
}
