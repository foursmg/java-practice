//program for armstrong Number
import java.util.Scanner;
public class EA17_armstrongNum {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int originalNum= input.nextInt();
        int temp= originalNum;
        int num=originalNum;

        //checking the number of digit in the number using loop
        int count=0;
        while(temp>0){
            count++;
            temp=temp/10;
        }

        int powSum=0;
        while(num>0){
            int rem= num%10;
            powSum= powSum + (int)Math.pow(rem,count);
            num= num/10;
        }
        if(powSum==originalNum){
            System.out.println("It's an Armstrong Number.");
        }else {
            System.out.println("Not an Armstrong Number.");
        }

    }
}

/*
Armstrong Number: A positive integer equal to the sum of it's own digits each raised to the
power of the total number of digits.
e.g. : 153 is an armstrong number -> 1^3 + 5^3 + 3^3 = 3+125+27 = 153
       1634 is an armstrong number -> 1^4 + 6^4 + 3^4 + 4^4 = 1+1296+81+256 = 1634
       1 -> 1^1=1; 2->2^1=2;....

    Armstrong numbers examples:-
    1-digit- 0,1,2,3,4,5,6,7,8,9
    2-digit- There are no 2-digit armstrong numbers.
    3-digit- 153,370,371,407
    4-digit- 1634,8208,9474
    5-digit- 54748,92727,93084
    6-digit- 548834
    ......



 */
