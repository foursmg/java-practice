import java.util.Scanner;
public class C3_ternaryOperator_positiveNegative {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number(+ve or -ve): ");
        int x= input.nextInt();
        String result= (x>0)?"Positive":"Negative";
        System.out.println(result);
    }
}
