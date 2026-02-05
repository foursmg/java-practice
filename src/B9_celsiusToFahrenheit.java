import java.util.Scanner;
public class B9_celsiusToFahrenheit {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the value of celsius: ");
        float c= input.nextFloat();
        float fahrenheit= (c*9)/5+32;
        System.out.println(c+" in fahrenheit is: "+fahrenheit);
    }

}
