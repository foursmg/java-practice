import java.util.Scanner;
public class GA18_matrixSumAvg {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int[][] arr= new int[3][3];// we can take size od row and column as input also

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

        int count=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
                count++;

                }
        }
        System.out.println("Sum: "+sum);
        double Avg= (double)sum/count;
        System.out.println("Avg: "+Avg);
    }
}

/*

import java.util.Scanner;
public class array{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int[][] num= {{1,2,3,4,5}, //jagged array
                      {6,7,8},
                      {9,5,2,3}};

        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.print("\n");
        }
        int count=0;
        int sum=0;
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
               sum=sum+num[i][j];
               count++;
            }
        }
        System.out.println("Sum: "+sum);
        double avg= (double)sum/count;
        System.out.println("Avg: "+avg);

    }
}

*/