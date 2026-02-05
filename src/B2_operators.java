import java.util.Scanner;
public class B2_operators {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        int a= input.nextInt();
        System.out.println("Enter the value of B: ");
        int b= input.nextInt();
        System.out.println(a+" + "+b+" = "+(a+b));
        System.out.println(a+" - "+b+" = "+(a-b));
        System.out.println(a+" * "+b+" = "+(a*b));
        System.out.println(a+" / "+b+" = "+(a/b));
        System.out.println(a+" % "+b+" = "+(a%b));

        //Shorthand Operators
        a *= 3; // a= a*4;
        System.out.println(a);
        b /=4; //b= b/4;
        System.out.println(b);
        //similarly *=,  %=, +=

        //unary operator
        //x= -x, coverts positive to negative
        System.out.println(-a);
        // decrement the value by 1 then use
        System.out.println(--a); //eg a=5, prints 4
        // increment the value by 1 then use
        System.out.println(++a); // prints 5
        //use current value then increment by 1
        System.out.println(a++); // prints 5, then a becomes 6
        //use current value then decrement by 1
        System.out.println(a--); // prints 6, then a becomes 5

    }
}