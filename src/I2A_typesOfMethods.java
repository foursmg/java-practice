class Studentt{

    String name;
    int age;
    String city;

    void display(){    // 1. no return no parameter
        System.out.println("Hello "+name+" "+"Age: "+age+" City: "+city);
    }

    void add(String city){    // 2. with parameter, no return
        System.out.println("From "+city);
    }


    int year(){      //3. with return / No parameter
        return 2057;
    }

    int points(int a, int b){   // 4. with return with parameter
        return a+b;
    }


}
public class I2A_typesOfMethods{
    public static void main(String[]args){

        Studentt s1 = new Studentt();
        s1.name="kelly";
        s1.age= 23;
        s1.city= "Kolkata";


        s1.display(); //calling no return no parameter method (1)

        s1.add("Kansas");  // calling with parameter, no return method (2)

        System.out.println("Batch Year: "+ s1.year());  // calling with return, no parameter  (3)
        //int yr = s1.year();        (Can do this also)
        //System.out.println("Year:"+yr);

        System.out.println("Points accumulated: "+ s1.points(3,4));   //
        //int totalP = s1.points(7,18);   (can do this also)
        //System.out.println("Points accumulated: "+totalP);

    }
}