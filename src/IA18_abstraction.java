//Parent class
abstract class Automobile{

    //abstract method - What to do, not how
    abstract void start();

    //abstract method - What to do, not how
    abstract void wheels();

    //Concrete method - Shared implementation
    void fuel(){
        System.out.println("Automobile uses fuel");
    }
}

//child classes, must implement all the abstract methods
//Uses default fuel() method
class Jeep extends Automobile{

    @Override //works without @Override also but good practice to use it
    void start(){
        System.out.println("Jeep Starts");
    }
    @Override
    void wheels(){
        System.out.println("Has four wheels.");
    }
}

//child classes, must implement all the abstract methods
//Overrides fuel(), Concrete methods can be overridden
class Scooter extends Automobile{

    @Override
    void start(){
        System.out.println("Scooter starts");
    }

    @Override
     void wheels(){
         System.out.println("Has two wheels");
     }

     void fuel(){
         System.out.println("Consumes less fuel than jeep.");
     }
}

public class IA18_abstraction {
    public static void main(String[]args){

        Automobile a; //Parent reference (Upcasting)
                      // it only creates a reference variable of type Automobile
                      //**Method call is resolved at runtime, Based on actual Object(Jeep/Scooter)
                      //This is Dynamic Method Dispatch

        a= new Jeep(); //Object creation
        a.start();
        a.fuel();
        a.wheels();

        a= new Scooter(); //Object creation
        a.start();
        a.wheels();
        a.fuel();
    }
}




/*

//abstrac class
//Can not be instantiated directly
//can have: abstract methods, conceret methods, constructors
abstract class vehicle{

    String brand;   //abstract class can have variables, can have instance, static final varibales.


    abstract void size();  //abstract method, subclass Must override
    abstract void sparetyre(int n);
    abstract void engine();   //abstract method, subclass must override

    void info(){           //concrete method, inherited as-is unless overridden
        System.out.println("Vehicle company: "+ brand);
    }

}

//car class, implements all abstract methods
class car extends vehicle{    //child class which will implement parent class vehicle
                              //Must implement all the abstract methods from abstract parent class

    @Override
    void size(){
        System.out.println("Cars are small-medium size vehicle.");
    }

     void sparetyre(int n){
        System.out.println("Number of spare tyre: "+n);
    }

    @Override
    void engine(){
        System.out.println("Have medium size engine");
    }

}

//racecar extends car(already concrete)
class racecar extends car{

    @Override
    void engine(){
        super.engine();    //super keyword, lets child extend parent behavior rather replacing it.
        System.out.println("Race cars have high power engine.");   //overriting engine method from parent class
    }

    void info(){                     //overrides vehicle's concrete method
        System.out.println("Brand of the car is: "+ brand);
    }

}

public class Main{
    public static void main(String[]args){

        car c1 = new car();   //creating an oject of class car with reference c1

        c1.brand = "Toyota";  //assigning 'toyota' in variable brand in of class vehicle
        System.out.println("Brand: "+c1.brand);
          c1.sparetyre(1);
        c1.size();          //calling methods
        c1.engine();
        c1.info();  //car will implement info method from parent class


        System.out.println("___________________________");

        racecar rc = new racecar();
        System.out.println("Brand: "+rc.brand);  //Brand: null
        rc.size();
        rc.engine();
        rc.info();   //Brand of the car is: null
        rc.brand= "Honda";
        rc.info();   //Brand of the car is: Honda
                      //racecar overrides info method directly (vehicle → car → racecar)
        System.out.println("___________________________");


        //Polymorphism -> abstract class as reference Type
        vehicle v1;
        v1= new car();
        v1.brand="Kia";
        v1.engine();
        v1.size();
        v1.info();
        System.out.println("___________________________");


        v1= new racecar();
        v1.brand="Ford";
         v1.engine();
        v1.size();
        v1.info();
    }
}


/*

c1 and rc are different Objects
rc.brand was null initially because object c1 had value assigned to brand, not rc
each object has its own copy of instance variable


*/

/*
abstract class vehicle{

    //Abstract methods (only declaration)
    abstract void start();

    abstract void braks();

    abstract void wheel();

    //Concrete methods (full implementation)
    void show(String vehicle){
        System.out.println("Vehicale is: "+vehicle);
    }
}

class car extends vehicle{

    @Override
    void start(){
        System.out.println("CArs start");
    }

    @Override
    void braks(){
        System.out.println("Car have Break Paddle");
    }

    @Override
    void wheel(){
        System.out.println("Cars have 4 wheels");
    }

}

class bike extends vehicle{
    @Override
    void start(){
        System.out.println("Bike Starts with a kick or self");
    }

    @Override
    void braks(){
        System.out.println("Bike Have leaver for break");
    }

    @Override()
    void wheel(){
        System.out.println("Bike Have 2 Wheels");
    }

    @Override
    void show(String vehicle){
        super.show(vehicle);    //It calls parent version
        System.out.println("Bike are fun to ride");
    }
}

class racecar extends car{

    //method overriding, This replaces parent behavior.
    @Override
    void braks(){
        System.out.println("race Cars have Very Good breaks");
    }

}

public class Main{
    public static void main(String[]args){


        // Dynamic method dispatch method
        // Run time polymorphism
        vehicle x;      //creates a parent reference variable
        x= new car();   //Dynamic method dispatch

        x.start();     //Java checks actual object at runtime
        x.show("Honda Car");

        x= new bike();
        x.start();
        x.show("Yamaha");

        x= new racecar();
        x.wheel();
        x.braks();


        //Normal Object creation, No polymorphism invilved
        car c1 = new car();
        c1.wheel();
        c1.show("Ford");


    }
}



OUTPUT:-
CArs start
Vehicale is: Honda Car
Bike Starts with a kick or self
Vehicale is: Yamaha
Bike are fun to ride
Cars have 4 wheels
race Cars have Very Good breaks
Cars have 4 wheels
Vehicale is: Ford




 */

