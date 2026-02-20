import java.util.Scanner;
public class GA17_2_D_arraySearchElement {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int[][] arr= new int[3][3];

        //taking 2d array element as input
        System.out.println("Enter the Elements in 3*3 array: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print("Enter the element_"+i+""+j+": ");
                arr[i][j]=input.nextInt();
            }
        }

        //displaying the 2D array
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }

        int key;
        System.out.println("Enter the key to look for: ");
        key=input.nextInt();
        int count=0;

        //searching for the key in matrix
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==key){
                    System.out.println("Key found at postion: "+i+""+j);
                    count++;
                }
            }
        }
        if(count>0){
            System.out.println("Number of occurrence of key in matrix: "+count);
        }else{
            System.out.println("Key not found in the array: ");
        }
    }
}


/*
without taking input-

import java.util.Scanner;
public class array{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int[][] num= {{1,2,3,4,5}, //jagged array
                      {6,7,8},
                      {9,5,2,3}};

        //for displaying array
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.print("\n");
        }

        //main logic for search and occurrence
        int count=0;
        int key=5;
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                if(num[i][j]==key){
                    System.out.println("Element found at Position: "+i+""+j);
                    count++;
                }
            }
        }
        if(count>0){
            System.out.print("Number of Occurrence of key in the matrix: "+count);
        }else
        {
            System.out.print("Element not found in the matrix.");
        }

    }
}

*/