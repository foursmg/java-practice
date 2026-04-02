class Employee{
    String name;
    int age;
     //Java inserts: Employee(){} invisibly
    //Once we define any constructor, Java stops providing the default.
}

public class I3_defaultConstructor {
    public static void main(String[]args){
        Employee e1 = new Employee();
        System.out.println(e1.name); //null
        System.out.println(e1.age);  //0
    }
}
