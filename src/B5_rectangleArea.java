// Area of rectangle = 1/2*b*h;
import java.util.Scanner;
public class B5_rectangleArea {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);

        System.out.println("Enter the value of breadth: ");
        int b=input.nextInt();
        System.out.println("Enter the value of height: ");
        int h=input.nextInt();

        //float area=(1/2)*b*h; this would produce error

        double area= (double)1/2*h*b;
        System.out.println("Area of the rectangle is: "+ area);
    }
}


//float area= (1/2)*b*h;          here 1 and 2 both are int, 1/2=0 (Not 0.5);
//and it will become 0*b*h=0; hence we need to convert it into float

//float area= (1f/2)*b*h;         this works
//float area= (float) (0.5*b*h);  this also works
//double area=  0.5*b*h;          this works too (0.5 is double literal, So Java does floating-point multiplication)
//float area= 0.5f*b*h;           this too
//float area= (float)1/2*(l*b);   this one also
//float area= (b*h)/2;            works

