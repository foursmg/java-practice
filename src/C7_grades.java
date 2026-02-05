import java.util.Scanner;
public class C7_grades {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the marks: ");
        int marks= input.nextInt();

        //float marksP= (marks/500)*100; if this used for marks percentage which is float but marks is int so,
        //marks/500, e.g. 450/500=0 and not 0.9 because marks is int and 500 also int, convert either in float
        float marksP= ((float)marks/500)*100;
        System.out.print("Marks percentage is: "+marksP+"%  ");

        if(marksP>=90){
            System.out.println("A Grade");
        }else if(marksP<90 && marksP>=75){
            System.out.println("B Grade");
        }else if(marksP<75 && marksP>=60){
            System.out.println("C Grade");
        }else if(marksP<60 && marksP>=30){
            System.out.println("D Grade");
        }else if(marksP<30){
            System.out.println("F");
        }
    }

}
//type conversion Implicit conversion
// int a=10;
//float b= a;

//type conversion explicit casting
//int a=10;
//float b= (float)a;