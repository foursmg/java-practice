//program for palindrome number, palindrome number reverse=original same, eg 121 1331 15651 etc
import java.util.Arrays;
public class GA15_arrayPalindrome {
    public static void main(String[]args){
        int[] numA= {1,2,3,4,5,6,7,8,9}; // {1,2,3,4,5,4,3,2,1}
        int[] numB= new int[numA.length];
        for(int i=0;i<numA.length;i++){
            numB[i]=numA[numA.length-i-1];
        }
        System.out.println(Arrays.toString(numB));

        //first we reverse the array
        boolean flag=true;
        for(int i=0;i<numA.length;i++){
            if(numA[i]!=numB[i]){
                flag=false;
                break; //without break it will work fine but loop will keep running which is not needed
            }
        }
        //then check weather the reverse and the original is same or not
        if(flag==true){
            System.out.println("Array is palindrome.");
        }else{
            System.out.println("Array is not palindrome.");
        }
    }
}
