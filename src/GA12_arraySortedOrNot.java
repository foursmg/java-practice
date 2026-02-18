// program to check weather elements in the array is sorted or not
import java.util.Scanner;
import java.util.Arrays;
public class GA12_arraySortedOrNot {
    public static void main(String[]args){
        //taking arrays inputs
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements:  ");
        int n = input.nextInt();

        int[] num = new int[n];

        System.out.println("Enter the elements-");
        for(int i=0;i<num.length;i++){
            System.out.print("Enter the element_"+(i+1)+": ");
            num[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(num));

        //actual logic for Sorted or not
        int count=0;
        if(num[0]<num[1]){
            for(int i=0;i<num.length-1;i++){ //
                if(num[i]<=num[i+1]){        //
                    continue;                //
                }else {                      //
                    count++;                 //
                    break;                   //
                }
            }
        }else{
            for(int i=0;i<num.length-1;i++){  //
                if(num[i]>=num[i+1]){         //
                    continue;
                }else{
                    count++;
                    break;
                }
            }
        }
        if(count>0){
            System.out.println("Elements are not Sorted.");
        }else{
            System.out.println("Elements are Sorted.");
        }

    }
}

/*

line 21. first check weather 1st element is smaller than the 2nd if true enter the if statement
22. and check for ascending order
23. if i<=i+1, means following ascending order
24. continue and keep checking ; if all in order program will then exit the if statement
25. if any found false i.e. i!<= i+1 means order broken
26. count becomes 1
27. and breaks out of the loop.

31. if above num[0]<num[1] false meaning 1st element is actually bigger than 2nd
32. then it will check for descending order and rest will follow same as above
*/

/*
without taking input from user

public class array{
    public static void main(String[]args){
        int[] num= {9,9,9,8,6,5,4,3,2,1};
        int count=0;
        if(num[0]>num[1]){
            for(int i=0;i<(num.length-1);i++){
                if(num[i]<=num[i+1]){
                    continue;
                }else{
                    count++;
                    break;
                }
            }
        }else{
            for(int i=0;i<(num.length-1);i++){
                if(num[i]>=num[i+1]){
                    continue;
                }else{
                    count++;
                    break;
                }
            }
        }
        if(count>0){
            System.out.print("Numbers not in order.");
        }else{
            System.out.print("Sorted elemets.");
        }
    }
}

*/


/*

without using count variable, using boolean instead

public class sortedOrNot {
    public static void main(String[] args) {

        int[] num = {9,8,7,6,5,4,3,2,1};

        if(num.length < 2){
            System.out.println("Array Sorted.");
            return;
        }

        boolean ascending = num[0] < num[1];

        for(int i = 0; i < num.length - 1; i++){

            if(ascending){
                if(num[i] > num[i+1]){
                    System.out.println("Array Not Sorted.");
                    return;
                }
            }
            else{
                if(num[i] < num[i+1]){
                    System.out.println("Array Not Sorted.");
                    return;
                }
            }
        }

        System.out.println("Array Sorted.");
    }
}


*/