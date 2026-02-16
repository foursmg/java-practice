// Copyin an array using System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
import java.util.Arrays; //this line for Arrays.toString() method
public class G7_copyArray_arraycopy {
    public static void main(String[]args){

        int[] numA= {11,22,33,44,55,66,77,88,99,110};
        int[] numB= new int[numA.length]; //creating array numB of length same as numA
        int[] numC= new int[15];

        //copyin elements of numA into numB
        System.arraycopy(numA,0,numB,0,10);
        System.out.println("numB: "+Arrays.toString(numB));

        //copying numA 3 element from index 7 into numC arrays at index 4
        System.arraycopy(numA,7,numC,4,3);
        System.out.println("numC: "+Arrays.toString(numC));

    }
}
