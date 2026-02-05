import java.util.Scanner;
public class B8_fahrenheitToCelsius {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the fahrenheit Value: ");
        float f= input.nextFloat();
        float celsius= (f-32)*5/9;
        System.out.println(f+" in celsius is: "+celsius);
    }
}
