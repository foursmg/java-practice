//Factorial of a number using recursive function
import java.util.Scanner;
public class E7_factorialFunction {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        int a= input.nextInt();
        System.out.println("Factorial of "+a+" : "+factorial(a));
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
}