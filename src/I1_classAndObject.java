class Student {
    String name;
    int age;

    void hello(){
        System.out.println("Hello "+name);
    }

    void display() {
        System.out.println(name + " " + age);
    }
}
public class I1_classAndObject {
    public static void main(String[] args) {

        Student s1 = new Student(); // object created

        s1.hello(); // method call
        s1.display(); // method call
        s1.name = "Gautam";
        s1.age = 20;

        s1.hello(); // method call

        s1.display(); // method call
    }
}


/*

here 'name' is a class (instance variable)
In Java, instance variable get default values
for String, default value = null
for int, default value = 0

 */