//Program for number of occurrence of an element in an array/ Not Binary search(binary search uses sorted array);
import java.util.Scanner;
import java.util.Arrays;
public class G10_arrayNoOfOccurrences {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        //taking array size as input
        System.out.print("Enter the number of elemets/size of array: ");
        int n = input.nextInt();

        int[] num = new int[n]; //declaring array num, and assigning the array size n

        //taking int inputs for array
        System.out.println("Enter the numbers-");
        for(int i=0;i<num.length;i++){
            System.out.print("Enter the element_"+(i+1)+": ");
            num[i]= input.nextInt();
        }

        System.out.println(Arrays.toString(num));

        System.out.println("Enter the key to be searched: ");
        int key = input.nextInt();

        //comparing array element with key
        int count=0; //declaring a count var for storing occurrence
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                count++;
                System.out.println("Element found at postion: "+(i+1));
            }
        }
        if(count>0){
            System.out.println("number of occurrence: "+count);
        }
        else {
            System.out.println("Key not Found!!!");
        }

    }
}


/*
A simpler version without taking any input from user

public class occurrences{
    public static void main(String[]args){
        int[] num= {11,22,34,22,43,56,2,67,22};
        int key=22;
        int count=0;
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                count++;
                System.out.println("Element found at: "+(i+1));
            }
        }
        if(count>0){
            System.out.print("No. of Occurrences: "+count);
        }else
        {
            System.out.print("Element not found!!");
        }
    }
}


*/



/*
______________________________________________________________________________________________________________________
Note- Function Should compute and return,
      main() should print
      this makes code reusable;

Note- Local variable must be initialized, e.g.:  in below case first=-1,last=-1;
      why -1; -1 -> clearly "Not found"
           0;  0 -> confusing for 1-based index
Note- for indices:- int first=-1; int last=-1;

______________________________________________________________________________________________________________________



Program for searching the number of occurrence of an element in an array, using function.

public class array{
    public static void main(String[]args){
        int[] arr= {1,2,3,4,5,6,7,8,9,2};
        int key=2;
        int occ= occurrence(arr,key);
        if(occ==0){
            System.out.print("Element Not Found!!");
        }else
        {
            System.out.print("Element Found, Number of Occurrence: "+occ);
        }
    }
    public static int occurrence(int[] num,int key){
        int first=-1,last=-1,count=0;
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                if(first==-1){
                    first=i+1;
                }
                last=i+1;
                count++;
            }
        }
        if(count>0){
            System.out.println("First Occurrence: "+first);
            System.out.println("Last occurrence: "+last);
        }
        return count;
    }
}





*/