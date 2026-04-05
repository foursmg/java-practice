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
