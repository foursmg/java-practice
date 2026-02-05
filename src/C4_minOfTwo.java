import java.util.Scanner;
public class C4_minOfTwo {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        int a= input.nextInt();
        System.out.println("Enter the value of B: ");
        int b= input.nextInt();
        int min= (a<b)? a: b;
        System.out.println(min+" is the min of "+a+" and "+b);
    }
}
