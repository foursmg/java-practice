// Simple interest= (P*R*T)/100;
import java.util.Scanner;
public class B6_simpleInterest {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the Principle: ");
        int p= input.nextInt();
        System.out.println("Enter the time: ");
        int t= input.nextInt();
        System.out.println("Enter the Rate: ");
        int r= input.nextInt();
        float si= (p*r*t)/100;
        System.out.println("Simple Interest is: "+si);
    }
}
