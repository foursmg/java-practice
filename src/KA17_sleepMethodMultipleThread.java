class test9 extends Thread
{
    public void run()
    {
        try{
            for(int i=1;i<=5;i++)
            {
                System.out.println(i+" "+ Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
public class KA17_sleepMethodMultipleThread {
    public static void main(String[]args){

        test9 t1 = new test9();
        t1.start();

        test9 t2 = new test9();
        t2.start();
    }
}
