// Function basics
import java.util.Scanner;
public class E2_function {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);

        hello();//then call the function (ref. line 26)

        System.out.println("Enter a name: ");
        String name= input.nextLine();
        greetings(name); //calling 2nd function

        //this for 3rd function called sum
        System.out.println("Enter the value of A and B: ");
        int a=input.nextInt();
        int b=input.nextInt();
        int addition= sum(a,b);
        System.out.println("Sum: "+addition);
        //can do this also instead of above 2 line
        //System.out.println("Sum: "+sum(a,b));//calling the sum function directly in print statement
    }

    // A very simple function that returns message
    //it's a simple print message which isn't taking any parameter from main body
    //hence ()has no parameter
    public static void hello(){ //1st create a function like this
        System.out.println("Hello");
        return;// since this method/function is void 'return is not necessary'
    }

    //this is 2nd function unrelated to 1st function above
    //taking string parameter from main body hence (String name)
    public static void greetings(String name){
        System.out.println("Hello "+name);
    }

    //3rd function unrelated to other two function
    public static int sum(int a, int b){
        int add= a+b;
        return add;
        //return a+b also works
    }

}
