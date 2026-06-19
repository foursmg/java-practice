class Medical extends Thread
{
    public void run()
    {
        try{
            System.out.println("Medical Examination begun.");
            Thread.sleep(2000);
            System.out.println("Medical Examination Finished.");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
class DrivingTest extends Thread
{
    public void run()
    {
        try{
            System.out.println("Driving Test Started.");
            Thread.sleep(2000);
            System.out.println("Driving Test Ended.");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
class OfficerSign extends Thread
{
    public void run()
    {
        try{
            System.out.println("File waiting for approval");
            Thread.sleep(2000);
            System.out.println("Driving Licence Approved.");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
public class KA22_joinLicense {
    public static void main(String[]args) throws InterruptedException{

        Medical medical = new Medical();
        medical.start();

        medical.join();

        DrivingTest dt = new DrivingTest();
        dt.start();

        dt.join();

        OfficerSign os = new OfficerSign();
        os.start();

        os.join();

    }
}
