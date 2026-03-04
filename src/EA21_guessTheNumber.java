//program for a game where we keep taking integer input from user until it matches the right number
import java.util.Scanner;
public class EA21_guessTheNumber {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num =54;  //put different value here
        int temp;
        do{
            System.out.print("Enter a Number:  ");
            temp = input.nextInt();
            if(temp>num){
                System.out.println("Entered Number is Greater-");
            }else if(num>temp){
                System.out.println("Entered Number is Smaller-");
            }
        }while(num!=temp);
        System.out.println("Correct Guess");
    }
}
