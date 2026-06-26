// GCD/HCF of two numbers
import java.util.Scanner;
public class EA11_gcd {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter A: ");
        int a = input.nextInt();
        System.out.println("Enter B: ");
        int b = input.nextInt();
        int gcd= gcdFunction(a,b);
        System.out.println("GCD: "+gcd);
    }
    public static int gcdFunction(int a,int b){
        int least = leastFunction(a,b);
        int gcd=1,i =2;
        while(i<=least){
            if(a%i==0 && b%i==0){
                gcd=i;
            }i++;
        }return gcd;
    }
    public static int leastFunction(int a,int b){
        return a<b ? a : b;
    }
}


/*
GCD(Greatest Common Divisor) or  HCF(Highest Common Factor)
GCD is the largest number that divides two(or more numbers exactly,
without leaving a reminder

gcd(12,18) = 6; 6 is highest number that divides both 12 and 18
             12 -> factors of 12 -> 1 2 3 4 6 12
             18 -> factors of 18 -> 1 2 3 6 9 18
             Common factor -> 1 2 3 6
             Highest common factor -> 6
             gcd= 6;


             (Prime Factorization)
gcd(12,18) = 12 -> 2^2 * 3
             18 -> 2 * 3^3
             gcd -> take lowest power common from both -> 2 * 3 =6

gcd(4,5) = 4 -> 2^2
           5 -> 5
           gcd -> 1; 1 is always factor of any pair or group of numbers
gcd(3,13) = 3 -> 2
            13 -> 13
            gcd -> 1;



*/

//---------------------------------------------------------------------------------------------------------------------

/*

Without using function / in main method

public class main{
    public static void main(String[]args){
        int a=3, b=51;

        //finding the smaller number
        int num= a>b? b: a;

        //gcd
        int i=1;
        int gcd=1; //initializing gcd=1, since any number have always 1 as their divisor, even if they are co-prime
        while(i<=num){
            if(a%i==0 && b%i==0){
                gcd = i;
            }i++;
        }
        System.out.print(gcd);
    }
}

*/

//---------------------------------------------------------------------------------------------------------------------

/*

Using function - But getting the smaller of a and using ternary operator instead of creating and calling
a separate function for it.

public class Main{
    public static void main(String[]args){

        int a = 20, b = 28;

        int GCD = gcd(a,b);
        System.out.println("GCD: "+ GCD);
    }
    public static int gcd(int a,int b){
        int gcd = 1;
        int i=2;
        int SNum = a>b ? b : a;
        while(i<SNum){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }
}

*/

//-------------------------------------------------------------------------------------------------------------------


/*

Using for Loop

public class Main{
    public static void main(String[]args){

        int a=20, b = 28;

        int gcd=1;

        int SmallNum = a>b ? b : a;
        for(int i=2;i<SmallNum;i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        System.out.println("GCD of "+a+" & "+b+" : "+gcd);
    }
}



*/