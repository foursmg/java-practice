import java.util.Arrays;
public class GA14_arrayReverse {
    public static void main(String[]args){
        int[] numA= {1,2,3,4,5,6,7,8,9};
        int[] numB= new int[numA.length];
        for(int i=0;i<numA.length;i++){
            numB[i]=numA[numA.length-i-1];
        }
        System.out.println(Arrays.toString(numB));
    }
}
