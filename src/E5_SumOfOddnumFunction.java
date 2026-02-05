//program function for sum of odd no. from 1 to n;
import java.util.Scanner;
public class E5_SumOfOddnumFunction {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number");
        int a= input.nextInt();
        oddSum(a);
    }
    public static void oddSum(int a){
        int i=1,sum=0;
        while(i<=a){
            sum=sum+i;
            i=i+2;
        }
        System.out.println("Sum: "+sum);
    }
}



/*
import java.util.Scanner;
public class E5_SumOfOddnumFunction {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number");
        int a= input.nextInt();
        int sumOdd= oddSum(a);
        System.out.println("Sum :"+sumOdd);
    }
    public static int oddSum(int a){
        int i=1,sum=0;
        while(i<=a){
            sum=sum+i;
            i=i+2;
        }
        return sum;
    }
}
*/