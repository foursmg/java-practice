class Ship{
    void sails(){
        System.out.println("Ship sails in sea");
    }
}
class CargoShips extends Ship{
    void carry(){
        System.out.println("Cargo ship carries Goods/containers");
    }
}
class Ferries extends Ship{
    void passenger(){
        System.out.println("Farries carry people ");
    }
}
public class I9_hierarchialInheritance {
    public static void main(String[] args){

        //Can access parent class
        CargoShips cs= new CargoShips();
        cs.sails();//inherited from ships
        cs.carry();// defined in CargoShips itself
        System.out.println("----------------------");

        //can access parent class
        Ferries fs= new Ferries();
        fs.sails();//inherited from ships(superclass)
        fs.passenger();//inherited from Ferries itself

        //But cant access the other class method
        //cs.passenger(); CargoShips class object cant access method of other class Ferries
        //fs.carry(); similarly Ferries class object cant access method of CargoShips
        //but both can access parent class Ship method

    }
}