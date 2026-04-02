class Bike{
    String brand;            //class variables / attribute
    double rating;               //class variable

    //parameterized constructor, Takes value as input
    Bike(String brand, double rating ){
        System.out.println("Parameterized Constructor.");   //prints message when called
        this.brand=brand;     //Uses this to assign values to object variables
        this.rating=rating;
    }

    //display method
    void display(){
        System.out.println("Brand is: "+brand+". Rating: "+rating);
    }

}
public class I5_parameterizedConstructor {
    public static void main(String[]args){

        //object creation, created using 'new' keyword
        //constructor runs automatically,- values are initialized.
        Bike b = new Bike("Yamaha",7.8);

        System.out.println(b.brand);

        b.display();  //calling display method from class Bike
    }
}
