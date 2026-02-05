import java.util.Scanner;
public class E8_sumOfDigits {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a= input.nextInt();
        int i=0;
        int sum=0;
        while(i<=a){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of numbers till "+a+" : "+sum);
    }
}
