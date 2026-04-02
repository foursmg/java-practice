class Cars{
    String brand;
    int year;

    //parameterized constructor
    Cars(String brand,int year){
        this.brand=brand;
        this.year=year;
    }

    //copy constructor, below c is one object of it's type input
    // Car(before brackets)- Constructor name
    //Car(inside brackets)- Data type(same class)
    //c - reference variable(points to an existing object
    Cars(Cars c){
        this.brand=c.brand;
        this.year=c.year;
    }

    void display(){
        System.out.println("Brand is: "+brand+"\n"+"Model year is: "+year);
    }
}
public class I6_copyConstructor {
    public static void main(String[]args){
        Cars c1= new Cars("Toyota",2004);
        Cars c2= new Cars(c1); // copy Constructor
        c1.display();
        c2.display();
    }
}
