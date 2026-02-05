// !!!!!!!!! NOT operator
import java.util.Scanner;
public class D4_bitwiseNOT{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        int bitwiseNOT= ~a;
        System.out.println("Complement of "+a+" = "+bitwiseNOT);
        //trick-> ~a= -(a+1)
    }
}

// NOT operator means 0->1; 1->0
//BUT
//isn't that simple in java
//1s complement, convert 1 into 0 and 0 into 1; e.g. 1100-> 0011
//2s complement, Add 1 to 1s complement; e.g. 1100 -> 1s -> 0011 -> 2s -> 0011+1 -> 0100

//BUTTTTT not so simple in java
//JAVA uses 32-bit signed integers
// here java flips all the 32 bits
//normally 5-> 0101 ->1s complement -> 1010->10; 5 should be 10 but that's not the case

// java uses 32bits so 5-> 00000000 00000000 00000000 00000101
// ~applied ~5
// 11111111 11111111 11111111 11111010 ,and NOW!!! this binary will be interpreted using 2s complement

// step-1. check MSB/most significant bit(first bit from left side) if 1-> Negative, if 0-> positive
//111.... 11111010 (~5) has been used to find the sign(+ve, -ve) which is -ve here

//step-2. find magnitude-> do 1st complement of last RESULT -> 11111010 -> 1s -> 00000101
// Add 1 to it -> 00000101+1 -> 000000110 -> which is 6 and since sign we found was -ve in step 1

// final result -6

// trick/rule for NOT operator
// ~a= -(a+1)




