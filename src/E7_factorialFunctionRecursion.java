//Factorial of a number using recursive function
import java.util.Scanner;
public class E7_factorialFunctionRecursion {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a Number for factorial: ");
        int a= input.nextInt();

        if(a<0){                                                         //(for edge case when user enters -ve num)
            System.out.print("Negative number, Factorial not defined."); // (this if block is optional)
            return ;                                                     //
        }                                                                //

        System.out.println("Factorial of "+a+" : "+factorial(a));
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
}