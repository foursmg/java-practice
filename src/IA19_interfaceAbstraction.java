interface Bags{


    //Interface methods are implicitly public. e.g.- (public) void BagUtility.....
    void BagUtility();
    void BagSize();

    // Interface can have concrete methods using default and static (Java 8+)
    //Interface methods are implicitly public
    //default method in interface is public — overriding it without public
    // makes it package-private (narrower)., (ref. line 37)
    default void BagMaterial(){    //concrete method using default
        System.out.println("Made of Good material.");
    }

    //***Static methods cannot be overridden, Belongs to the interface itself
    //not inherited by implementing classes
    //called using interface name only
    static void WaterResistance(){  //concrete method using static, this is also public
        System.out.println("----");
    }

}

class Backpack implements Bags{
    @Override
    public void BagUtility(){
        System.out.println("Carry Daily Stuff.");
    }
    @Override
    public void BagSize(){
        System.out.println("Medium, Can carry on back.");
    }

    //Overriding the BagMaterial()
    @Override
    public void BagMaterial(){
        System.out.println("Polyester");
    }

}

class Handbag implements Bags{

    @Override
    //Method overriding here must have public cause(ref. line 8)
    public void BagUtility(){
        System.out.println("Carry essential use stuff.");
    }

    @Override
    public void BagSize(){
        System.out.println("Small, Can Carry on Shoulder.");
    }

    //didn't overrode the BagMaterial() here, will use default if called from here


}

public class IA19_interfaceAbstraction {
    public static void main(String[]args){
        Bags b;

        b = new Backpack();
        b.BagSize();
        b.BagUtility();
        b.BagMaterial();


        b = new Handbag();
        b.BagUtility();
        b.BagSize();
        b.BagMaterial();

        //static method — called via interface name
        Bags.WaterResistance();




    }

}

/*
interface bags{

    void utility();  // In interface methods are automatically public - abstract public
    void size();     // i.e. public abstract void size(); -> this is how java treats it


      // default method is a method with implementatkion inside interface
      // and maybe overridden when needed
    default void waterproof(){
        System.out.println("Some are Waterproof, Some are not.");
    }


    //***Static methods cannot be overridden, Belongs to the interface itself
    //not inherited by implementing classes
    //called using interface name only
    static void material(){
        System.out.println("Good quality Material.");
    }
}

class backpack implements bags{

    @Override                // Overriding method cannot have weaker access (private -> default -> protected ->public)
    public void utility(){   // since methods are treated public in interface, hence using public access here
        System.out.println("Daily Use.");   // child method can keep same visibility or increase it, but cannot reduce it
    }

    @Override
    public void size(){
        System.out.println("Medium size, can carry on back");
    }
}

class luggage implements bags{
    @Override
    public void utility(){
        System.out.println("Travel.");
    }

    @Override
    public void size(){
        System.out.println("Big.");
    }

    @Override
    public void waterproof(){
        System.out.println("Most of them are.");
    }
}

public class Main{
    public static void main(String[]args){

        bags b;
        b = new backpack();
        b.utility();
        b.size();
        b.waterproof();
        // b.material();  // static method called using interface name only
        bags.material();

        System.out.println("------------------");

        b= new luggage();
        b.utility();
        b.size();
        b.waterproof();

    }
}

OUTPUT:-
Daily Use.
Medium size, can carry on back
Some are Waterproof, Some are not.
Good quality Material.
------------------
Travel.
Big.
Most of them are.


 */
