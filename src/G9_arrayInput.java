// A program for taking int values as input for array
import java.util.Scanner;
import java.util.Arrays; //this for only toString method at line 22
public class G9_arrayInput {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        //taking the size of array from user
        System.out.print("Enter the size of Array: ");
        int n = input.nextInt();

        int[] num = new int[n]; //declaring an array num, and assigning the size n;

        System.out.println("Enter the elements of the Array- ");
        //taking the numbers as input for array
        for(int i=0;i<num.length;i++){
            System.out.print("Enter the element_"+(i+1)+": "); //optional line
            num[i]= input.nextInt();
        }

        //using toString method for displaying array
        System.out.println(Arrays.toString(num));
    }
}



/*
can use either of two methods below in-case not using toString method at line 22 for displaying array elements

loop method
for(int i=0;i<num.length;i++){
System.out.print(num[i]+" ");
}

for-each loop method
for(int x: num){
System.out.print(x+" ");
}



*/