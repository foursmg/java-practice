class BookBusSeat1
{
    int total_seats=10;
    synchronized void bookSeat(int seats){
        if(total_seats>=seats){
            System.out.println(Thread.currentThread().getName()+ " Booked Bus seat successfully.");
            total_seats = total_seats-seats;
            System.out.println("Remaining seats: "+ total_seats);
        }else{
            System.out.println(Thread.currentThread().getName()+" Seats not available.");
            System.out.println("Seats left: "+ total_seats);
        }
    }
}
class BusBookApp1 extends Thread{

    static BookBusSeat1 b;
    int seats;
    public void run(){
        b.bookSeat(seats);
    }
}
public class KA28_synchronizedMethod {
    public static void main(String[]args){

        BusBookApp1.b = new BookBusSeat1();

        BusBookApp1 kelly = new BusBookApp1();
        kelly.seats = 5;
        kelly.start();

        BusBookApp1 jelly = new BusBookApp1();
        jelly.seats = 7;
        jelly.setName("Jelly");
        jelly.start();
    }
}
