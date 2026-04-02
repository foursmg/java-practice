class Pen{ //Class Name
    String colour;  //Class variables/attribute
    String brand;  //Class variables

    //Class method/function/behaviour
    public void write(){
        System.out.println("Writing something...");
    }

    //this.- Refer to the current class’s instance variables and methods
   //with help of 'this' keyword it will know which object is calling it
    public void printColour(){
        System.out.println(this.colour);
    }
}

public class I2_classAndObject {
    public static void main(String[]args){
        Pen pen1= new Pen(); //pen1 object of class Pen

        //Accessing/modifying attribute of class using dot syntax(.)
        pen1.colour="blue";
        pen1.brand="cello";
        pen1.write();

        Pen pen2= new Pen();//2nd object
        pen2.colour="black";
        pen2.brand="flair";

        pen1.printColour();//calling printcolour from class
        pen2.printColour();
    }
}
