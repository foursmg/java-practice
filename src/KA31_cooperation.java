class movieEarning extends Thread
{
    int total;
    public void run()
    {
        synchronized (this){
            for(int i=1;i<=10;i++)
            {
                total = total +100;
            }
            this.notify();
        }
    }
}
public class KA31_cooperation {
    public static void main(String[]args) throws InterruptedException{

        movieEarning e1 = new movieEarning();
        e1.start();

        synchronized (e1){
            e1.wait();
            System.out.println("Total Earning for 10 seats is: "+e1.total);
        }
    }
}

/*


class movieEarning extends Thread
{
    int total;
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            total = total +100;
        }
    }
}
public class KA31_cooperation {
    public static void main(String[]args){

        movieEarning e1 = new movieEarning();
        e1.start();

        System.out.println("Total Earning for 10 seats is: "+e1.total);
    }
}

OUTPUT: Total Earning for 10 seats is: 0

 */