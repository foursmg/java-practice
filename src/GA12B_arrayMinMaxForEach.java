//finding max element in an array using for-each loop
public class GA12B_arrayMinMaxForEach {
    public static void main(String[]args){
        int[] arr= {12,342,46,76,433,56,764,34};
        int max=arr[0];
        for(int num : arr){
            if(max<num){
                max= num;
            }
        }
        System.out.println("Max element in the array: "+max);
    }
}


/*
max and min both using for-each loop-

public class minMax{
    public static void main(String[]args){
        int[] arr= {21,54,23,54,64,23,56,64,42};
        int max= arr[0];
        int min= arr[0];
        for(int x : arr){
            if(max<x){
                max=x;
            }
            if(min>x){
                min=x;
            }
        }
        System.out.println("Max element in the array: "+max);
        System.out.print("Min element in the array: "+min);
    }
}

*/

/*

max and min element in the array using for loop-

public class minMax{
    public static void main(String[]args){
        int[] arr= {21,54,23,54,64,23,56,64,42};
        int max= arr[0];
        int min= arr[0];
       for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Max element in the array: "+max);
        System.out.print("Min element in the array: "+min);
    }
}


*/