//copying elements of one array into another
//Element copy
import java.util.Arrays;
public class G6_copyArrayLoop {
    public static void main(String[]args){
        int[] numA = {11,22,33,44,55,66,77,88,99,110};
        int[] numB = new int[10];

        //iterate and copy elements from one array to another
        for(int i=0;i<numA.length;i++){
            numB[i]=numA[i];
        }

        System.out.println("NumB elements: ");
        for(int x: numB){
            System.out.println(x);
        }

        //updating an element in numA
        numA[0]=-54;

        System.out.println("First element of numA after update: "+numA[0]);
        System.out.println("First elemnet of numB after update in numA: "+numB[0]);

        //toString  -- Arrays.toString()
        //prints the content of an array in a readable format
        //must use import java.util.Arrays; at the beginning of the program
        //works only for 1-d array i.e. int[] a or a normal array/ not for 20d or 3-d
        System.out.println(Arrays.toString(numA));
        System.out.println(Arrays.toString(numB));
    }
}
/*
here two separate arrays are created in memory, then values are copied one by one
and they are stored at different memory locations(two different objects)

Copying using a loop creates a new array with duplicated values, so changes in the original array do not affect the
copied array.

*/