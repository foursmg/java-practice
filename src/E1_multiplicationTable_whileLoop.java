//While loop program
import java.util.Scanner;
public class E1_multiplicationTable_whileLoop {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number for It's table: ");
        int a = input.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(a+" * "+i+" = "+ (i*a));
            i++;
        }
    }

}

/*
while loop syntax
while(condition){
//code to execute
}
*/