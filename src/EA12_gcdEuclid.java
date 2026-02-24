// GCD/HCF of two numbers using euclid's method
import java.util.Scanner;
public class EA12_gcdEuclid {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int a= input.nextInt();
        System.out.print("Enter num2: ");
        int b= input.nextInt();
        System.out.println("GCD: "+gcdEuclid(a,b));
    }
    public static int gcdEuclid(int a,int b){
        while(b!=0){          // how to choose which var or num we shall check for 0(Rule- whichever number is becoming reminder, that will become 0)
            int rem= a%b;
            a=b;
            b=rem;
        }return a;
    }
}

/*
    Important: a%b = a modulus b = gives remainder when a is divided by b
     24%3= 0; Dividend=24, Divisor= 3, Quotient=8, Remainder=0;
    if we want Quotient a/b= 24/3=8;
    if we want Remainder a%b= 23%3= 0;

     **imp
     a%b formula
     a%b= a-(b*Quotient)
     24%3= 24-(3*8) = 24-24= 0;
     18%12= 18-(12*1) = 18-12=6;

     **imp.
     12%18 = 12-(18*0)= 12-0 = 12
     Remember: If Divisor is greater than Dividend, remainder is dividend itself
     e.g. 7%10 =7
          5%500 = 5

     ___________________________________________________________________

GCD(18,12)- 12)18(1
               12
              =6)12(2
                 12
                =0
              GCD=6

GCD(18,12) -> a=18 b=12
1st iteration: a=18, b=12
               while(b!=0) -> 12!=0 (true)(enter loop)
               rem= a%b= 18%12= 6;     rem=6;
               a=b -> a=12;
               b=rem -> 6;
2nd iteration: a=12, b=6;
               while(b!=0) -> 6!=0 (true)(enter loop)
               rem= a%b = 12%6=0;      rem=0;
               a=b -> a=6;
               b=rem -> b=0;
3rd iteration: a=6, b=0;
               while(b!=0) -> 0!=0 (false)(exit loop)
               return a; -> return 6;
               gcd=6;


*/