import java.util.Scanner;
public class C1_signCheck {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double x= input.nextDouble();
        if(x>0){
            System.out.println(x+" is a positive number.");
        } else if(x<0){
            System.out.println(x+" is a negative number.");
        }else
        {
            System.out.println("It's a ZEROOOO");
        }
    }
}

/*
Using Ternary Operator

for 2 case positive and negative

int num=-9;
String sign= num>0? "Positive": "Negative";
System.out.print(sign);
Output- Negative



for 3 case zero,positive,negative

int num=0;
String sign= num>0?num+" Positive" : num==0? num+ " Zero": num+ " negative";
System.out.print(sign);
Output- 0 zero



*/