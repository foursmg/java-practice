// program to check weather elements in the array is sorted or not
import java.util.Scanner;
import java.util.Arrays;
public class GA13_arraySortedOrNot {
    public static void main(String[]args){
        //taking arrays inputs
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements:  ");
        int n = input.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements-");
        for(int i=0;i<nums.length;i++){
            System.out.print("Enter the element_"+(i+1)+": ");
            nums[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(nums));

        //calling sorted or not function
        sorted(nums);

    }
    //actual logic for Sorted or not
    public static void sorted(int[] nums){
        boolean ascending = true;
        boolean descending = true;
        for(int i=0;i<nums.length-1;i++){

            if(nums[i]>nums[i+1]){
                ascending=false;
            }

            if(nums[i]<nums[i+1]){
                descending=false;
            }

        }
        if(ascending || descending){
            System.out.println("Elements are Sorted.");
        }else{
            System.out.println("Elements are not Sorted.");
        }
    }
}



/*
without taking input from user

public class sorted{
    public static void main(String[]args){
    int[] arr = {9,9,9,7,6,4,3,1};
    sorted(arr);
    }
    public static void sorted(int[] nums){
        boolean asc = true;
        boolean des = true;
        for(int i=0;i<nums.length-1;i++){

            if(nums[i]>nums[i+1]){
                asc = false;
            }

            if(nums[i]<nums[i+1]){
                des= false;
            }

        }
        if(asc||des){
            System.out.print("Sorted");
        }else{
            System.out.print("Not Sorted.");
        }
    }
}


*/


