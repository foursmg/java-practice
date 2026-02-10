// using Euclid method of gcd for lcm
import java.util.Scanner;
public class EA13_gcdLcmEuclid {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int a= input.nextInt();
        System.out.print("Enter the num2: ");
        int b= input.nextInt();
        int gcd= gcdEuclid(a,b);
        System.out.println("GCD: "+gcd);

        //Once the gcd is found we can find the lcm by dividing the product of both num by it's gcd-> a*b/gcd(a,b)
        int lcm= (a*b)/gcd;
        System.out.println("LCM: "+lcm);
    }
    public static int gcdEuclid(int a,int b){
        while(b!=0){
            int rem= a%b;
            a=b;
            b=rem;
        }
        return a;
    }

}
/*
 LCM(12,18) -> 12: 2^2 * 3
               18: 2 * 3^3
               taking highest common power from both number-> 2^2 * 3^3 = 4 * 9 = 36
               = 36
 GCD(12,18) -> 12: 2^2 * 3
               18: 2 * 3^3
               taking lowest common power from both number -> 2 * 3 = 6
               =6

 Remember:  lcm of two num a and b = a*b/gcd
                                   example: lcm(12,18)= 12*18/gcd(12,18)
                                                      = 12*18/6 = 36
                                                      =36




*/