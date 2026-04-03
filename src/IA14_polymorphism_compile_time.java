class Calculator{

    //same name methods with different parameters
    //depending upon the parameters of calling object, method with the same parameter type will be returned

    int add(int a,int b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }

    double add(double a,double b){
        return a+b;
    }

    String add(String a, String b){
        return a+b;
    }

    void add(){
        System.out.println("This method doesn't have parameter.");
    }

    void add(int a){
        System.out.println("1");
    }

}

public class IA14_polymorphism_compile_time {
    public static void main(String[]args){

        //creating an object c1 of class Calculator
        Calculator c1 = new Calculator();

        //passing two strings in add method would return result from add similar kind of parameter
        System.out.println(c1.add("Hello"," world"));

        //here the same passing two int values would return result from similar kind of method
        System.out.println(c1.add(2,67));

        //calling method with no parameter will fetch result of add();
        c1.add();

        System.out.println(c1.add(2.4,3.33));

        System.out.println(c1.add(2.0,3.33));

        c1.add('a');//1
        //it is passing a single parameter char 'a', but the method with single parameter
        //has parameter defined int not char but still that method is being accessed
        //Reason type promotion.
    }
}

/*

Automatic Type Promotion
Java automatically converts a smaller data type into a bigger data type when needed.
byte → short → int → long → float → double
char → int → long → float → double

Always moves left → right (small → large)

No reverse conversion
double -> int // won't happen

 Exact match > Promotion
2. Smaller → Bigger only
3. No data loss allowed automatically
4. Used in expressions + method overloading


*/