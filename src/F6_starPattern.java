public class F6_starPattern {
    public static void main(String[]args){
        int i,j,k;
        for(i=0;i<5;i++){

            //for printing Space
            for(j=0;j<5-i-1;j++){
                System.out.print(" ");
            }

            //for printing stars
            for(k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.print("\n"); // moves to new line/row
        }
    }
}

/*

    *
   **
  ***
 ****
*****

*/

/*

For n number of rows

import java.util.Scanner;
public class star{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        int i,j,k;
        System.out.print("Enter A: ");
        int n= input.nextInt();
        for(i=0;i<n;i++){

            for(j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}


*/