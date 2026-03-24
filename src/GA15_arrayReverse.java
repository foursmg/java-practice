//Program for Reversing an Array (using a new arrays)
import java.util.Arrays;
public class GA15_arrayReverse {
    public static void main(String[]args){
        int[] numA= {1,2,3,4,5,6,7,8,9};
        int[] numB= new int[numA.length];
        for(int i=0;i<numA.length;i++){
            numB[i]=numA[numA.length-i-1];
        }
        System.out.println("Array numA: "+Arrays.toString(numA));
        System.out.println("Array numB: "+Arrays.toString(numB));
    }
}



/*

//Program for Reversing an Array (using the same array(In-place))

import java.util.Arrays;
public class reverse{
    public static void main(String[]args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));
        int start = 0;
        int end = arr.length-1;
        int temp;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}


 */