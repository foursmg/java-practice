//vehicle class created/ also superclass
class vehicle{
    void engine(){
        System.out.println("Vehicles have engine ");
    }
}

//derived class/ child class of vehicle class using 'extend' keyword
class Motorcar extends vehicle{
    void wheels(){
        System.out.println("A car has four wheels");
    }
}

//derived class race car from car class using 'extend' keyword
class RaceCar extends Motorcar{
    void runs(){
        System.out.println("Race cars runs fast");
    }
}

public class I8_multilevelInheritance {
    public static void main(String[]args){

        //object rc created of Racecar;
        RaceCar rc= new RaceCar();
        rc.engine();// rc object of RaceCar inheriting superclass nethod engine
        rc.wheels();// inheriting from Cars
        rc.runs(); //Method defined in Race car itself
        System.out.println("-------------------------------");

        //BUT
        //Parent class Object cannot access child class methods
        vehicle truck = new vehicle();
        truck.engine(); // truck can access its own class method
        //truck.wheels();  But here parent class object cannot access child class methods
        //truck.runs(); same here parent class object can't access child class method
        System.out.println("--------------------------------");

        //Creating object of class Motorcar
        Motorcar c1 = new Motorcar();
        c1.wheels(); // can access own class method
        c1.engine(); // can access it's parent class method
        //c1.runs(); // can't access it's child class method
    }
}