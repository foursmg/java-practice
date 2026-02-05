// Leap year condition  1. divisible by 400 but not but 100
// and also divisible by 4
import java.util.Scanner;
public class C6_leapYear {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year= input.nextInt();
        if(year%400==0){
            System.out.println(year+" is a leap year.");
        }else if(year%100==0){
            System.out.println(year+" is not a leap year.");
        }
        else if(year%4==0) {
            System.out.println(year + " is a leap year.");
        }else {
            System.out.println(year+" is not a leap year.");
        }
    }
}
