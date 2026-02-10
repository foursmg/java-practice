import java.util.Scanner;
public class EA16_fibonacciRecursion {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of term: ");
        int n = input.nextInt();

        //int fibo=fibo(n); this
        //System.out.println(fibo(n)); or this won't work, fibo(n) will print nth fibonacci NUMBER
        // ex: n=5, fibo(5) returns 5; fibo(n) won't return the SERIES only one particular number for given input
        //loop is needed to print Series

        //printing the fibonacci series
        int i=0;
        while(i<n){
            System.out.println(fibo(i)+" ");
            i++;
        }
    }

    //Recursive function for fibonacci
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}

/*
fibo -> a sequence where each number is the sum of the two preceding ones, starting from
        0 and 1 (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...).

        Recursion returns ONE Value
        Loop in needed to print a series

*/
