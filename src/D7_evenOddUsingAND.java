import java.util.Scanner;
public class D7_evenOddUsingAND {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        //if(num&1==1) used java reads it as 'a & (1==1)' cuz
        //== has higher precedence than &; will cause type error;
        if((num&1)==1)
        {
            System.out.println(num+" is odd");
        }
        else
        {
            System.out.println(num+" Even");
        }
    }
}
// num & 1 isolates the least significant bit(last bit)
//Binary of even numbers-> last bit is always=0;
//Binary of odd numbers-> last bit is always=1
// a&1 checks only last bit
// if the result is 1, the number is odd
// if the result is 0, the number is even
//  This method is faster than using num%2 because it directly manipulates bits
// works for both +ve and -ve numbers