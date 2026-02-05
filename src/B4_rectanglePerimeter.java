//Perimeter of rectangle= a+b+c+d
import java.util.Scanner;
public class B4_rectanglePerimeter {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        int a=input.nextInt();
        System.out.println("Enter the value of B: ");
        int b=input.nextInt();
        System.out.println("Enter the value of C: ");
        int c=input.nextInt();
        System.out.println("Enter the value of D: ");
        int d=input.nextInt();
        System.out.println("Perimeter of the given rectangle is: "+(a+b+c+d));
    }
}
