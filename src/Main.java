class Test{

    int i = 10;
    static int j = 20;

    static void show(){

        System.out.println("This is a static method.");

        //System.out.println(i); non-static method can't be accessed inside static method.
        System.out.println(j);
    }

    void display(){
        System.out.println("This is a non-static method.");

        //non-static method can access both static variable and non-static variable
        System.out.println(i);
        System.out.println(j);

        //non-static method can access both static and non-static method also
        show();
    }



}
 
public class main{
    public static void main(String[]args){

        //no object creation needed to call the static method
        //is called directly
        Test.show();
        System.out.println(""); //creating space between output for better readability

        //Test.display(); this won't work for non-static method
        //need to create an object for it
        Test t1 = new Test();          //creating an object called t1 of class Test
        t1.display();                  //calling display() method through object
        System.out.println("");  //creating space between output for better readability

        System.out.println(Test.j); // accessing static variable directly without creating an object
    }
}

/*

Static method can't access non-static  because, sttaic method runs without object
Non-static variable(i) exists inside object
So java doesn't know:- "Which object's i should i use?"

 */