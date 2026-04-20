class Car{
    String brand;
    int speed;

    //No argument constructor - User defined
    //user creates it. In this case default constructor won't be created.
    Car(){
        brand= "honda";
        speed=0;
        System.out.println("No Argument Constructor.");
    }
}
public class I4_NoArgConstructor {
    public static void main(String[]args){
        Car c = new Car();
        System.out.println(c.brand);  //honda
        System.out.println(c.speed);  //0
    }
}


/*

Example 2. No-arg constructor

class Student{

    String name;
    int age;
    String city;

    Student(){          //No argument Constructor (types of constructor)
        name = "Kelly";
        age = 43;
        System.out.println("Welcome");
    }

    void display(){
        System.out.println("Hello: "+name+", Age: "+age);
    }


}
public class Main{
    public static void main(String[]args){

        Student s1 = new Student();

        s1.display();

        s1.name= "John";
        s1.age = 32;

        s1.display();


    }
}

OUTPUT
Welcome
Hello: Kelly, Age: 43
Hello: John, Age: 32



 */