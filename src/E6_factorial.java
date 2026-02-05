// Factorial of a number; n!
import java.util.Scanner;
public class E6_factorial {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a= input.nextInt();
        int factorial=1;
        int i=1;
        while(i<=a){
            factorial= factorial*i;
            i++;
        }
        System.out.println("Factorial of "+a+" is: "+factorial);
    }
}

// factorial= n*(n-1)*(n-2)*(n-3).....3*2*1
// eg 5!= 5*4*3*2*1
