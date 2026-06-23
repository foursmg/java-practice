class BookBusSeat2
{
    int total_seats =10;
    void bookSeat(int seats){

        //Some lines of code which are not synchronized (can run concurrently)
        System.out.println("A: "+Thread.currentThread().getName());
        System.out.println("A: "+Thread.currentThread().getName());
        System.out.println("A: "+Thread.currentThread().getName());

        synchronized (this){    // Synchronized Block
            if(total_seats>= seats){
                System.out.println(Thread.currentThread().getName()+ " Seat booked successfully.");
                total_seats = total_seats-seats;
                System.out.println("Seats left: "+total_seats);
            }else{
                System.out.println(Thread.currentThread().getName()+" Seats not available");
                System.out.println("Only "+total_seats+" seats left");
            }
        }

        //Some lines of code which are not synchronized (can run concurrently)
        System.out.println("B: "+Thread.currentThread().getName());
        System.out.println("B: "+Thread.currentThread().getName());
        System.out.println("B: "+Thread.currentThread().getName());
    }
}
class BusBookApp2 extends Thread{

    static BookBusSeat2 b;
    int seats;
    public void run() {
        b.bookSeat(seats);
    }
}
public class KA29_synchronizedBlock {
    public static void main(String[]args){

        BusBookApp2.b = new BookBusSeat2();

        BusBookApp2 john = new BusBookApp2();
        john.seats = 8;
        john.start();

        BusBookApp2 rick = new BusBookApp2();
        rick.seats = 3;
        rick.start();

    }
}
