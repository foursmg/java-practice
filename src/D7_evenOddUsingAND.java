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
//Binary of even numbers-> last bit is always=0; e.g. 2(010), 4(100), 6(110), 8(1000), 24(11000)........
//Binary of odd numbers-> last bit is always=1;  e.g. 1(001), 3(011), 5(101), 7(111) , 9(1001), 25(11001).......
// a&1 checks only last bit
// if the result is 1, the number is odd
// if the result is 0, the number is even
//  This method is faster than using num%2 because it directly manipulates bits
// works for both +ve and -ve numbers

/*
e.g. input 5-> 5&1 -> 0101  & 0001 -> 0001 -> 1 (odd)
     input 7-> 7&1 -> 0111 & 0001 -> 0001 -> 1 (odd)
     input 25-> 25&1 -> 11001 & 00001 -> 00001 -> (odd)

     input 6-> 6&1 -> 110 & 001 -> 000 -> 0 (even)
     input 12-> 12&1 -> 1100 & 0001 -> 0000 -> 0 (even)
     input 100-> 100&1 -> 1100100 & 0000001 -> 0 (even)


 */