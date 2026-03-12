//Sum of Odd numbers till n without using loop;
import java.util.Scanner;
public class E5_sumOfOddNumWithoutLoop {
    public static void main(String[]args){
     Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n= input.nextInt();

        int k= (n+1)/2;  //
        int sumOdd= k*k; //
        System.out.println("Sum of odd till "+n+" = "+sumOdd);
    }
}

/*
for a sequence starting from 1 up to N,
Sum of Odd till Nth term math formula-
Number of odd term till that number-> n -> (N+1)/2;
Sum of those term ->                  n*n -> n^2;

e.g.-
     n=5 -> number of odd term till 5 ? -> (1) 2 (3) 4 (5) -> 3 number are odd i.e 1,3,5
            it's sum= 1+3+5 =9
         -> using above formula -> n=5;Number of odd terms till n- > k -> (n+1)/2 -> (5+1)/2 -> 6/2 -> 3;
                                       sum of those terms -> k*k -> 3*3 -> 9



Number of Odd term(n) in a sequence from m to n,
 n=(largest-smallest)/2 + 1;

Number of even term from 1 to N -> n= N/2;
sum of first n even Numbers -> sum=n(n+1);


*/