class ShapeTool{
    void draw(){
        System.out.println("Drawing a shape");
    }
}

class CircleShape extends ShapeTool{
    @Override
    void draw(){
        System.out.println("Drawing a Circle");
    }

    //method specific to CircleShape only
    //not present in parent ShapeTool
    void display(){
        System.out.println("This is a circle.");
    }
}

class RectangleShape extends ShapeTool{
    @Override
    void draw(){
        System.out.println("Drawing a Rectangle.");
    }
}
public class IA15_polymorphism_runTimeEx1 {
    public static void main(String[]args){

        ShapeTool s;

        //normal object creation - no polymorphism
        s = new ShapeTool();
        s.draw();

        //runtime polymorphism - parent ref, child object
        s = new CircleShape();
        s.draw();      //Drawing a Circle - resolved at runtime
        //s.display();   //compile error - display() not in ShapeTool
                         //parent reference cannot see child-specific methods

        //CircleShape reference needed to access display()
        //which is defined only in CircleShape, not in ShapeTool
        CircleShape c1 = new CircleShape();
        c1.display();

        s= new RectangleShape();
        s.draw();

    }
}


/*

Reuse of Object 's' for 'c1'
Instead of creating a second CircleShape Object, you can downcast 's' when it holds a CircleShape Object

CircleShape c1 = (CircleShape) s;
c1.display();

This is called downcasting
But
s = new CircleShape(); //must be CircleShape object




 */