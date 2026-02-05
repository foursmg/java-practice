//sum of odd number from 1 till specified n
import java.util.Scanner;
public class E4_sumOfOddNum {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        int sum=0; // this is variable in which we will store the sum
        int i=1;
        while(i<=n){
            sum=sum+i;
            i=i+2;
            //program will exit this loop once it reaches n, and added all the value till then
        }
        //once it exits the loop sum will have total addition of odd num till n
        System.out.println("Sum from 1 till n is: "+sum);
    }

}
