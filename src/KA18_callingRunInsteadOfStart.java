class test10 extends Thread
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
public class KA18_callingRunInsteadOfStart {
    public static void main(String[]args){

        test10 t1 = new test10();
        t1.run();

        test10 t2 = new test10();
        t2.run();
    }
}
