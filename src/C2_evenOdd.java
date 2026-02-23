import java.util.Scanner;
public class C2_evenOdd {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= input.nextInt();
        if(n==0){
            System.out.print("Entered Number is Zero.");
        }else if(n%2==0){
            System.out.print("Even");
        }else
        {
            System.out.print("Odd");
        }


    }
}


//ternary operator-> variable= expression? exprssion2: expression3;
//if first condition true then expression2 executes else expression3

//Even odd using ternary operator

//String result=(n%2==0)? "even": "Odd";
//sout(result);

//or
// System.out.println((n%2==0)?"even":"Odd");

