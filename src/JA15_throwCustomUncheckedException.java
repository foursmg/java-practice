//Example of throwing Custom Exception (Unchecked- RunTime exception)
import java.util.Scanner;
class voteAgeException extends RuntimeException{
    voteAgeException(String message){
        super(message);
    }
}

public class JA15_throwCustomUncheckedException {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = input.nextInt();

        if(age<18){
            throw new voteAgeException("Age must Not be Less than 18.");
        }else{
            System.out.println("Eligible for vote");
        }

    }
}
