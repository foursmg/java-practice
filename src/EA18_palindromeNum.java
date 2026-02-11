import java.util.Scanner;
public class EA18_palindromeNum {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int originalNum= input.nextInt();
        int num=originalNum;
        int rem,rNum=0;
        while(num>0){
             rem= num%10;
             rNum= rNum*10 + rem;
             num= num/10;
        }
        if(rNum==originalNum){
            System.out.println("Palindrome number.");
        }
        else {
            System.out.println("Not a Palindrome number");
        }
    }
}

/*
Palindrome Number: an integer that remains the same when its digits are reversed,
reading identically forward and backward (e.g., 121, 1331, 51415).
 */
