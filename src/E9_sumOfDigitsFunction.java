import java.util.Scanner;
public class E9_sumOfDigitsFunction {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a= input.nextInt();
        int sumOfDigit= digitSum(a);
        System.out.println("Sum of digits till "+a+" : "+sumOfDigit);
    }

    public static int digitSum(int n){
        if(n==0){
            return 0;
        }
        return n+digitSum(n-1);

    }

}
