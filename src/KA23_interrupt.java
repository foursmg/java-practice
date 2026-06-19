class test14 extends Thread
{
    public void run()
    {
        try{
            for(int i=1;i<=5;i++)
            {
                System.out.println(i);
                if(i==3){
                    Thread.sleep(1000);
                }
            }
        }catch(Exception e){
            System.out.println("3 Found!!!! "+e);
        }
    }
}
public class KA23_interrupt {
    public static void main(String[]args){

        test14 t1 = new test14();
        t1.start();
        t1.interrupt();
    }
}


/*

 if we comment-out or remove the Thread.sleep() method
 the child thread won't go in Blocked or WAITING state and it won't be interrupted and hence catch part wont be executed
 program will run normal


 */