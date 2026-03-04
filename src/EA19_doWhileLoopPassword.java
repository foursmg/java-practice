//program for taking password as input until valid password is entered
import java.util.Scanner;
public class EA19_doWhileLoopPassword {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        String password= "abc@12345";
        String pass;
        do{
            System.out.println("Enter the Password: ");
            pass = input.nextLine();
            if(pass.equals(password)){
                System.out.println("Password Correct!!");
            }
        }while(!pass.equals(password));
    }
}

/*

String equals() method in Java compares the content of two strings. It compares the value's character by character,
irrespective of whether two strings are stored in the same memory location. The String equals() method overrides the equals() method of the object class.
false if any of the characters are not matched.
true if all characters are matched in the Strings.

== checks reference (memory location)
.equals() checks content
for String comparison in java, always use .equals()
.equals returns boolean value


*/