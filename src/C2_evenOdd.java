import java.util.Scanner;
public class C2_evenOdd {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= input.nextInt();
        if(n%2==0)
        {
            System.out.println(n+" is an even number.");
        }
        else
        {
            System.out.println(n+" is an odd number. ");
        }


    }
}

//Even odd using ternary operator
//ternary operator-> variable= expression? exprssion2: expression3;
//String result=(n%2==0)? "even": "Odd";
//sout(result);

//or
// System.out.println((n%2==0)?"even":"Odd");

