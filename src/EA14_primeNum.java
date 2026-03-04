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
/*

Note-
Since Prime Number is a number that is divisible only by 1 and itself(e.g. 7 is divisible by 1 and 7 itself)
hence
here we divide the given from 2 to (n-1) and if any number between these divides the number means there is more than two
factors and therefore it won't be a prime number
(e.g. n=8, from 2 to 7 it is divisible by 2 and 4 also that means beside 1 and 8 itself it is also divisible by other numbers
 hence it is not prime)

 BUT
 i= 2, and n=2, it doesn't really follow
 since taking n=2 when we start to divide from 2 we cant because 2<2 is false
 so the loop exits immediately without checking even once
  but since we are using count to check prime or not count stays 0 which gives the result of 2 being the prime,
  not the actual loop iteration





/
 */
/*
Using function-

public class primeNum{
    public static void main(String[]args){
        int n=7;
       // boolean prime = primeNum(n);
        if(primeNum(n)==true){
            System.out.print(n+" is a prime Number.");
        }else
        {
            System.out.print(n+" is not a prime Number.");
        }
    }
    public static boolean primeNum(int n){
        if(n<=1){
            return false;
        }
        int i=2;
        while(i<n){
            if(n%i==0){
                return false;
            }i++;
        }
        return true;
    }
}

*/