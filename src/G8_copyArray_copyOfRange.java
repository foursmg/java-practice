//copying an array using Arrays.copyOfRange(originalArray, fromIndex, toIndex);
import java.util.Arrays; //to use Arrays.toString() and Arrays.copyOfRange()
public class G8_copyArray_copyOfRange {
    public static void main(String[]args){
        int[] numA= {11,22,33,44,55,66,77,88,99,110};

        //Copying whole array of numA into numB
        int[] numB= Arrays.copyOfRange(numA,0,numA.length);  //(numA,0,10)
        System.out.println("numB: "+Arrays.toString(numB));

        //Copying 3 elements of numA 66,77,88 which are at index 5,6,7
        int[] numC= Arrays.copyOfRange(numA,5,8);
        System.out.println("numC: "+Arrays.toString(numC));

    }
}
/*

Arrays.copyOfRange(orignalArray, fromIndex(inclusive), toIndex(exclusive));

Note:- fromindex is inclusive meaning it will copy that index element but
       toIndex is exclusive meaning it's index element won't be included
       i.e. [5,8), index 5,6,7 will be included but not index 8 element

       when copying whole array prefer using array.length for the toIndex value




*/