class Car{
    String brand;
    int speed;

    //No argument constructor - User defined
    //user creates it. In this case default constructor won't be created.
    Car(){
        brand= "honda";
        speed=0;
        System.out.println("No Argument Constructor.");
    }
}
public class I4_NoArgConstructor {
    public static void main(String[]args){
        Car c = new Car();
        System.out.println(c.brand);  //honda
        System.out.println(c.speed);  //0
    }
}
