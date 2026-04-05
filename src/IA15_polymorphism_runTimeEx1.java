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

        s = new ShapeTool();
        s.draw();

        s = new CircleShape();
        s.draw();

        s= new RectangleShape();
        s.draw();

    }
}
