import java.util.Scanner;
public class EA14_primeNumForLoop {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n= input.nextInt();
        int count=0;
        if(n<=1){
            System.out.print("Not a Prime Numebr.");
            return;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.print("Not a Prime Number.");
                return;
            }
        }
        System.out.print("Prime Number.");
    }
}
