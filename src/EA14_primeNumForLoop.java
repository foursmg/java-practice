import java.util.Scanner;
public class EA14_primeNumForLoop {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n= input.nextInt();
        int count=0;
        for(int i=2;i<n;i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if(count>0){
            System.out.println("Not a Prime Number.");
        }else{
            System.out.println("Prime Number.");
        }
    }
}
