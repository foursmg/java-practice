import java.util.Scanner;
public class D6_rightShiftOperator {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = input.nextInt();
        int num= a >> 1;
        System.out.printf("After right shift: %s%n", num);
    }
}
//Same as left shift but in right

/*
right shift operator for number A and position n
 import java.util.Scanner;
 class Main {
 public static void main(String[] args) {
 Scanner input= new Scanner(System.in);
 System.out.print("Enter the value of A: ");
 int a= input.nextInt();
 System.out.print("Number of Postions you want to shift left: ");
 int n= input.nextInt();
 int leftShift= a>>n;
 System.out.print("~"+a+" = "+ leftShift);
 }
 }
 */
