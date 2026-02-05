import java.util.Scanner;
public class A5_add2Num{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        int a=input.nextInt();
        System.out.print("Enter the value of B: ");
        int b=input.nextInt();
        System.out.println("Sum of "+a+" and "+b+" is: "+(a+b));

    }

}