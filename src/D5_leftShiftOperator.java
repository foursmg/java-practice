import java.util.Scanner;
public class D5_leftShiftOperator{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=input.nextInt();
        int lShift= a<<3; //3 is we want to shift it 3 bit position by left
        // we can take user input n in place of 3 also
        System.out.printf("After LeftShift: %d",lShift);
        // printf also works here and eliminates the need to use + instead use ,
    }
}

// left shift operator shifts the bits to 1 place or specified place to left
// i.e.:- 3=0011 after 1 left shift(<<1) output= 0110=9
// another example

//input= 11  left shift(<<3)
//It will use 8 bits
//11= 0000 1011
//after 3 left shift-> 0101 1000 = 88

