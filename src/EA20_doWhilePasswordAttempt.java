//program for taking password as input until valid password is entered, within 3 attempts or user specified attempts
import java.util.Scanner;
public class EA20_doWhilePasswordAttempt {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String password = "abc@12345";
        String pass;
        int attempt = 0;
        do{
            if(attempt==0){
                System.out.println("Enter the password: ");
            }else{
                System.out.println("Enter the password again ("+(3-attempt)+" attempt left): ");
            }
            pass = input.nextLine();
            attempt++;
        }while(!pass.equals(password) && attempt<3);
        if(password.equals(pass)){
            System.out.println("Password Correct");
        }else {
            System.out.println("Account Locked!!!");
        }

    }
}
