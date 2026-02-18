// A program to return a new array deleting a specific array
//Note:- We can not change array size in java
// step1- count elements which are not same as key elements
// step2- create new array of that size
// step3- copy only required elements
import java.util.Arrays;
public class GA12_arrayDeleteSpecificeEement {
    public static void main(String[]args){
        int[] numA = {1,2,3,4,2,6,2,7};

        //specific element to be deleted
        int x=2;

        //finding the size of array
        int count=0;
        for(int i=0;i<numA.length;i++){
            if(numA[i]!=x){
                count++;
            }
        }

        //creating a new array
        int[] numB= new int[count];

        //copying elements into new Array
        int index=0;
        for(int i=0;i<numA.length;i++){
            if(numA[i]!=x){
                numB[index]=numA[i];
                index++;
            }
        }

        System.out.println(Arrays.toString(numA));
        System.out.println(Arrays.toString(numB));
    }
}
