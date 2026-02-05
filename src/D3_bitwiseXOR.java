import java.util.Scanner;
public class D3_bitwiseXOR{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        int a= input.nextInt();
        System.out.println("Enter the value of B: ");
        int b= input.nextInt();
        int bitwiseXOR= a^b;
        System.out.println(a+" ^ "+b+" = "+bitwiseXOR);
    }
}

// XOR ^
//if both input bit different output = 1
//if both input bit same output = 0
//i.e.:- 1^0=1, 0^1=1, 1^1=0, 0^0=0
// 1^8= 0001^1000=1001=9