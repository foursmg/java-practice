//guess the number using Math.random in limited tries
import java.util.Scanner;
public class EA22_guessTheNumber_random {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num = (int)(Math.random()*100)+1;
        int temp;
        int attempt=0;
        do{
            System.out.println("Enter a number: ");
            temp = input.nextInt();
            attempt++;
            if(temp>num){
                System.out.println("Entered Number is Greater");
                System.out.println("Attempt left:"+(10-attempt)+": ");
            }else if(num>temp){
                System.out.println("Entered Number is Smaller");
                System.out.println("Attempt left:"+(10-attempt)+" ");
            }else{
                System.out.println("Correct Guess!!!");
            }
        }while(num!=temp && attempt<10);
        if(num==temp){
            System.out.println("You have Won!!! on "+(attempt)+" attempt");
        }else{
            System.out.println("Better luck next time :( ");
        }
    }
}

/*
Math.random()
it produces number from 0.0(inclusive) to 1.0(exclusive) [0.0, 1.0)
e.g.- 0.234, 0.999, 0.001 etc (double Numbers) and (it will never return 1)

Math.random()*100
now output -> 0.0 to 99.999....

since it is producing double(decimal number) and we need integer for guess game
cast it into integer
(int)(Math.random()*100)

(int)(Math.random()*100)
now it will produce -> 0 to 99;

(int)(Math.random()*100)+1;
output range becomes -> 0 to 100;









*/
