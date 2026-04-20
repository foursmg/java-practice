/*
Association - (HAS-A) Relationship -
Relation between two separate classes, which establishes through their Objects.
A relationship where one class uses or has a reference of another class.

Example:-

class test1{
    void show(){
        System.out.println("Class one.");
    }
}

class test2{
    test1 t1 = new test1();     //HAS-A relationship

    void display(){
        t1.show();
        System.out.println("Class two");
    }
}
public class Main{
    public static void main(String[]args){

        test2 t2 = new test2();
        t2.display();

    }
}

OUTPUT-
Class one.
Class two

--------------------------------------------------------






 */