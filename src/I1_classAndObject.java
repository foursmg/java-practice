class Student {
    String name;
    int age;
    void display() {
        System.out.println(name + " " + age);
    }
}
public class I1_classAndObject {
    public static void main(String[] args) {

        Student s1 = new Student(); // object created

        s1.name = "Gautam";
        s1.age = 20;

        s1.display(); // method call
    }
}
