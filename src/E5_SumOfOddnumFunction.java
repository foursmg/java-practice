//program function for sum of odd no. from 1 to n;
// i.e. 1+3+5+7+.....n
import java.util.Scanner;
public class E5_SumOfOddnumFunction {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number");
        int a= input.nextInt();
        oddSum(a);
    }

    //function for sum of Odd num from 1 till n
    public static void oddSum(int a){
        int i=1,sum=0;
        while(i<=a){
            sum=sum+i;
            i=i+2; // i=1; i+2= 1+2=3; i=3 i+2= 5; i=5 i+2=7;.........
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