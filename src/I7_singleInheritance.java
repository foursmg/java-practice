//1st class also the super or parent class
class Animals{
    void eat(){
        System.out.println("Animals eat Food");
    }
}
//Dogs class which is being inherited from Animals class using 'extend' keyword
class Dogs extends Animals{
    void bark(){
        System.out.println("Dog Barks ");
    }
}
public class I7_singleInheritance {
    public static void main(String[]args){

        //an object named d1 of class Dogs created
        Dogs d1= new Dogs();

        d1.eat(); //this inherited from Animal class(parent class)
        d1.bark(); //method defined in Dogs class
    }
}