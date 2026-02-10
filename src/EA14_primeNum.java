import java.util.Scanner;
public class EA14_primeNum {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        if(a<=1){   // first check if 1 or -ve num
            System.out.println("Not a Prime Number."); //if true execute statement
            return; // return would immediately exit the main method, nothing below it runs
        }
        int i=2;
        int count=0;
        while(i<a){
            if(a%i==0){
                count++;
            }i++;
        }
        if(count>=1)
            System.out.println("Not a Prime Number.");
        else
            System.out.println("Prime Number.");

    }
}
/*
Prime Number: Prime number is a natural number greater than 1, divisible by 1 and itself only.
examples: 2,3,5,7,11,13,17...........
Note: 1 is not prime number nor is negative numbers(base condition in above code)

 */