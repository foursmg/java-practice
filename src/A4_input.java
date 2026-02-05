//taking input in java
import java.util.Scanner; //first this line
public class A4_input{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in); //and this line imp for input
        System.out.print("Enter your name: ");
        String name= input.nextLine();
        System.out.println("Hey "+name);
        System.out.println("Enter your age: ");
        int num = input.nextInt();
        System.out.println(name+" your age is "+num);

    }
}

//variable acceptable with these except use number at beginning
//([A-Z],[a-z],[0-9]), ‘ $ ‘ (dollar sign) and ‘_‘ (underscore)
//variables are case-sensitive