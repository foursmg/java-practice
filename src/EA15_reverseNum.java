// Reverse of a Given Number
import java.util.Scanner;
public class EA15_reverseNum {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int rNum=0, rem;
        while(num>0){
            rem= num%10;
            rNum= rNum*10 + rem;
            num= num/10;
        }
        System.out.println("Reverse: "+rNum);
    }
}


/*
Using Function-
public class reverseNum{
    public static void main(String[]args){
        int num=12345;
        int rNum= reverseNum(num);
        System.out.print(rNum);
    }
    public static int reverseNum(int n){
        int reverse = 0;
        while(n>0){
            int rem = n%10;
            reverse = reverse*10 + rem;
            n = n/10;
        }
        return reverse;
    }
}



 */