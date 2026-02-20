import java.util.Scanner;
public class GA19_matrixDiagonalSumAvg {
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
                if(i==j){
                    sum=sum+arr[i][j];
                    count++;
                }

            }
        }
        System.out.println("Sum: "+sum);
        double Avg= (double)sum/count;
        System.out.println("Avg: "+Avg);
    }
}
