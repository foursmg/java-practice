//program to merge two sorted array
import java.util.Arrays;
public class GA16_mergeTwoSortedArray {
    public static void main(String[]args){
        int[] numA= {1,3,5,7,9};
        int[] numB= {2,4,6,8,10,12,14};
        int[] numC= new int[numA.length+numB.length];
        int i=0;
        int j=0;
        int index=0;

        while(i<numA.length && j<numB.length){
            if(numA[i]<=numB[j]){
                numC[index]=numA[i];
                index++;
                i++;
            }else{
                numC[index]=numB[j];
                index++;
                j++;
            }
        }
        while(i<numA.length){
            numC[index]=numA[i];
            i++;
            j++;
        }
        while(j<numB.length){
            numC[index]=numB[j];
            j++;
            index++;
        }
        System.out.println(Arrays.toString(numC));
    }
}
