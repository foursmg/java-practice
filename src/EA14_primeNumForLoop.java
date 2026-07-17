import java.util.Scanner;
public class EA14_primeNumForLoop {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n= input.nextInt();
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



/*

public class Main{
    public static void main(String[]args){
        int n=4;
        if(n<=1){
            System.out.println("Number is Not a Prime Number.");
            return;
        }
        boolean prime = true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                prime = false;
                break;
            }
        }
        if(prime){
            System.out.println("Prime Number.");
        }else{
            System.out.println("Not a Prime Number.");
        }
    }
}

*/