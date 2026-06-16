class Test2 extends Thread
{
    public void run()
    {
        System.out.println("task runingg......");
    }
}
public class K9_isAlive {
    public static void main(String[]args){

        Test2 t1 = new Test2();
        System.out.println("t1 alive1 ?:  "+t1.isAlive());
        t1.start();
        System.out.println("t1 alive2 ?:  "+t1.isAlive());
        System.out.println("t1 alive3 ?:  "+t1.isAlive());

        System.out.println("Main Thread alive?:"+Thread.currentThread().isAlive());



    }
}
