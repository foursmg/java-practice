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
    //Important: a%b = a modulus b = gives remainder when a is divided by b
    // 24%3= 0; Dividend=24, Divisor= 3, Quotient=8, Remainder=0;
    //if we want Quotient a/b= 24/3=8;
    //if we want Remainder a%b= 23%3= 0;

        // a%b formula
    // a%b= a-(b*Quotient)
    // 24%3= 24-(3*8) = 24-24= 0;
    // 18%12= 18-(12*1) = 18-12=6;

        // **imp.
    // 12%18 = 12-(18*0)= 12-0 = 12
    // Remember: If Divisor is greater than Dividend, remainder is dividend itself
    // e.g. 7%10 =7
    //      5%500 = 5



        //Shorthand Operators
        a *= 3; // a= a*4;
        System.out.println(a);
        b /=4; //b= b/4;
        System.out.println(b);
        //similarly *=,  %=, +=

        // (-x)  unary operator
        //x= -x, coverts positive to negative
        System.out.println(-a);

        // (--x) decrement the value by 1 then use
        System.out.println(--a); //eg a=5, prints 4

        // (++x)  increment the value by 1 then use
        System.out.println(++a); // prints 5

        // (x++)  use current value then increment by 1
        System.out.println(a++); // prints 5, then a becomes 6

        // (x--)  use current value then decrement by 1
        System.out.println(a--); // prints 6, then a becomes 5

    }
}