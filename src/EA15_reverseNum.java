// Reverse of a Given Number
import java.util.Scanner;
public class EA15_reverseNum {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int rNum=0, rem;
        while(num>0){
            rem= num%10;
            rNum= rNum*10 + rem;
            num= num/10;
        }
        System.out.println("Reverse: "+rNum);
    }
}
