class BookBusSeat
{
    int total_seat= 10;
    void bookSeat(int seats){
        if(total_seat>= seats){
            System.out.println("Bus seat Booked Successfully");
            total_seat = total_seat - seats;
            System.out.println("Sets left: "+total_seat);
        }else{
            System.out.println("Seats cannot be Boooked.");
            System.out.println("Seats left: "+total_seat);
        }
    }
}

class BusBookApp extends Thread{
    static BookBusSeat b;
    int seats;
    public void run(){
        b.bookSeat(seats);
    }
}

public class KA27_BookBusSeat {
    public static void main(String[]args){

        BusBookApp.b = new BookBusSeat();

        BusBookApp Kelly = new BusBookApp();
        Kelly.seats = 6;
        Kelly.start();

        BusBookApp john = new BusBookApp();
        john.seats = 5;
        john.start();

    }
}
