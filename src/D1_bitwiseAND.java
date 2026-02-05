import java.util.Scanner;
public class D1_bitwiseAND{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the Value of A: ");
        int a= input.nextInt();
        System.out.println("Enter the Value of B: ");
        int b= input.nextInt();
        int bitwiseAnd= a & b;
        System.out.println(a+" & "+b+" = "+ bitwiseAnd);
    }
}

// AND Operator * &
// if even one input 0 output 0bit
//all input 1 output one
// 1 AND 0 || 1*0 || 1*1 || 1 AND 1
// Output:- 0 || 0 || 1 || 1
//eg- 5=0101 , 6=0110
// 5*6== 0101*0110= 0100=4