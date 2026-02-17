//finding max and min element in the array
import java.util.Scanner;
import java.util.Arrays;
public class GA11_arrayMinMax {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int[] num = new int[n];

        System.out.println("Enter the elements: ");
        for(int i=0;i<num.length;i++){
            System.out.print("Enter the element_"+(i+1)+": ");
            num[i]= input.nextInt();
        }
        System.out.println(Arrays.toString(num));

        int max= num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max= num[i];
            }
        }
        System.out.println("Max element: "+max);

        int min= num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]<min){
                min= num[i];
            }
        }
        System.out.println("Min element: "+min);

    }
}

/*
min and max in single loop
for(int i = 1; i < num.length; i++){
    if(num[i] > max){
        max = num[i];
    }
    if(num[i] < min){
        min = num[i];
    }
}

*/

/*

public class MinMax{
    public static void main(String[]args){
        int[] num= {11,22,34,22,43,56,2,67,22};
        int max= num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max = num[i];
            }
        }
        System.out.println("Max element in the array: "+max);
          int min= num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]<min){
                min = num[i];
            }
        }
        System.out.print("Min element in the array: "+min);

    }
}

*/