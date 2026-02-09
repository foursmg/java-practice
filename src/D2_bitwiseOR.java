import java.util.Scanner;
public class D2_bitwiseOR{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the value of A: ");
        a= input.nextInt();
        System.out.println("Enter the value of B: ");
        b= input.nextInt();
        int bitwiseOR= a | b;
        System.out.println(a+" | "+b+" = "+bitwiseOR);
    }
}

//OR + |
//all input 0 output 0; even one input 1 output 1
// 1+1=1, 1+0=1, 0+1=1, 0+0=0
// 4 OR 8-> 0100+1000=1100=12
