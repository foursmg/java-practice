// Area of rectangle = 1/2*b*h;
import java.util.Scanner;
public class B5_rectangleArea {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the value breadth: ");
        int b=input.nextInt();
        System.out.println("Enter the value of height: ");
        int h=input.nextInt();
        float area= (b*h)/2;
        //float area= (1/2)*b*h;          here 1 and 2 both are int, 1/2=0.5; but since its int it will become 0,
        //decimal will be discarded, and it will become 0*b*h=0; hence we need to convert it to float
        //float area= (1f/2)*b*h;         this works
        //float area= (float) (0.5*b*h);  this also works
        //double area=  0.5*b*h;          this works too
        //float area= 0.5f*b*h;           this too
        // float area= (float)1/2*(l*b);  this one also
        System.out.println("Area of the rectangle is: "+ area);
    }
}
