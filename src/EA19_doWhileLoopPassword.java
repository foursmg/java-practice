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


using function-

import java.util.Scanner;
public class passwordCheck{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String password= "abc@12345";
        boolean access = pass(password);
        if(access){
            System.out.print("Access Granted!");
        }else{
            System.out.print("Access Denied!");
        }
    }
    public static boolean pass(String password){
        Scanner input = new Scanner(System.in);   //In Java, variables created inside a method cannot be used in
        //another method unless you pass them as parameters or create them again.
        String temp;
        do{
            System.out.print("Enter the Password: ");
            temp = input.nextLine();
            if(temp.equals(password)){
                return true;
            }
        }while(!temp.equals(password));
        return false; //this required
        //must always return a boolean value, but if the loop somehow exits, Java still requires a return.
    }
}




import java.util.Scanner;
public class password{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String password = "abc@12345";
        passWord(password);
    }
    public static void passWord(String password){
        Scanner input = new Scanner(System.in);
        String pass;
        System.out.print("Enter your Password: ");
        int count=0;
        do{
                pass = input.nextLine();
           if(pass.equals(password)){
               System.out.print("Access Granted!");
               return;
           }else
           {
               System.out.print("Enter the password again: ");
           }
        }while(!pass.equals(password));
    }
}

*/