// printing table using while loop function
import java.util.Scanner;
public class E3_tableWhileLoopFunction {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a= input.nextInt();
        table(a);
    }
    public static void table(int n){
        int i=1;
        while(i<=10){
            System.out.println(i*n);
            i++;
        }
    }
}
