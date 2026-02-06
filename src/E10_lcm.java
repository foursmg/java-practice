//LCM of two integer
import java.util.Scanner;
public class E10_lcm {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a= input.nextInt();
        System.out.println("Enter the first number: ");
        int b= input.nextInt();
        int i=1; // if we put this i inside loop after each iteration it will set to 1
        while(true){  //ref. line 44
            int factor= a*i;
            if(factor%b==0){
                System.out.println("LCM :"+factor);
                break;
            }i++;
        }
    }
}

// LCM(least common multiple)
/*
LCM -> it's smallest positive number that is exactly divisible by all
given number.

lcm(4,5)- 20, 20 is divisible by both 4 and 5 and its smallest common number
more detailed(only for visualization and understanding):-
                4- multiple of 4: 4  8 12 16 (20) 24 28 32  36  40 44......
                5- multiple of 5: 5 10 15 (20) 25 30 35 40 45 50.......
                here we can see 20 is common in both and no other number smaller than 20 is common
                next common is 40 but here we are taking only smallest common

lcm(4,5)-  4: 2^2
           5: 5
           lcm= 2^2* 5= 4*5 =20
lcm(12,18)-12:2^2 * 3
           18:2 * 3^3
           lcm= taking maximum power from both: 2^2 * 3*3= 4 * 9= 36;
lcm(3,13)- 3:3
           13: 13
           lcm= 3*13= 39;
(for visualization only): 3: 3 6 9 12 15 18 21 24 27 30 33 36 (39) 42 .....
                          13: 13 26 (39) 52 65.............

the loop has been given condition always 'true' because from above example we can understand
give any two positive number it will definitely have a lcm hence we can keep it running till we find and then break
out of the loop

loop example,- a= 12 b=18 i=1;
1st iteration - a= 12 b=18 i=1;
                factor= a*i= 12*1=12
                if(12%18==0) not satisfied
                i++= i=2;
2nd iteration-  a= 12 b=18 i=2;
                factor= a*i= 12*2= 24
                if(24%18==0) not satisfied
                i++; i=3;
3rd iteration-  a= 12 b=18 i=3;
                factor= a*i= 12*3=36
                if(38%18==0) satisfied
                return/print factor i.e.= 36 = lcm
                break;

using function:-
import java.util.Scanner;
public class lcm{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a= input.nextInt();
        System.out.print("Enter B: ");
        int b= input.nextInt();
        int intLcm=lcm(a,b);
        System.out.println("LCM: "+intLcm);
    }

    public static int lcm(int a,int b)
    {
        int i=1;
        while(true){
            int factor= a*i;
            if(factor%b==0){
                return factor;
            }i++;
        }
    }
}
 */