import java.util.Scanner;
public class C1_signCheck {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x= input.nextInt();
        if(x>0){
            System.out.println(x+" is a positive number.");
        } else if(x<0){
            System.out.println(x+" is a negative number.");
        }else
        {
            System.out.println("It's a ZEROOOO");
        }
    }
}