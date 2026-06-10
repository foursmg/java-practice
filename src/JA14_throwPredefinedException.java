import java.util.Scanner;
public class JA14_throwPredefinedException{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your age: ");
        int age = input.nextInt();
        if(age<18){
            throw new RuntimeException("Age for Vote cannot be less than 18.");
        }
        System.out.println("Eligible for Vote.");
    }
}
