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
