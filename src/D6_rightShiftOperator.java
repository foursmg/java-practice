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

// a=4 sift 1 -> a>>1; -> 100 -> 010 -> 2;
// a=4 sift 2 -> a>>2; -> 100 -> 001 -> 1;
// a=4 sift 3 -> a>>3; -> 100 -> 000 -> 0;



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
