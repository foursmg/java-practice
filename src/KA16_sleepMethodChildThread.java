class test8 extends Thread
{
    public void run()
    {
       for(int i=0;i<=5;i++){
           try{
               Thread.sleep(1000);
           }catch(InterruptedException e){
               System.out.println(e);
           }

           System.out.println(i);
       }
    }
}
public class KA16_sleepMethodChildThread {
    public static void main(String[]args){

        test8 t1 = new test8();
        t1.start();
    }
}
