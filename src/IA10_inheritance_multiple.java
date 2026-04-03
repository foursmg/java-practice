interface Watch{
    void time();
}
interface Smartphone{
    void call();
}
class Smartwatch implements Watch,Smartphone{
    public void time(){
        System.out.println("Smartwatch tells the time.");
    }
    public void call(){
        System.out.println("Can make call");
    }
}
public class IA10_inheritance_multiple {
    public static void main(String[]args){
        Smartwatch sw= new Smartwatch();
        sw.time(); //Implemented from Watch interface
        sw.call(); //Implemented from Smartphone interface
    }
}