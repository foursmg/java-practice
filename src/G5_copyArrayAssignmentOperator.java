//copying elements of one array into another
//Reference copy
public class G5_copyArrayAssignmentOperator {
    public static void main(String[]args){

        int[] num= {1,2,3,4,5,6,7,8,9,10};

        //copying num array using Assignment operator
        int[] positiveNum= num;

        for(int x: positiveNum){
            System.out.println(x);
        }

        //but if we change any element in first array it would change in 2nd also
        num[0]=-33;
        for(int x: positiveNum){
            System.out.println(x);
        }
    }
}

//this does not create a new array
//Both variables point to the same memory location.
//In Java, arrays are objects. Using the assignment operator copies the reference,
// not the actual data (shallow copy).

/*
for(int i=0;i<positiveNum.length;i++){
            System.out.println(positiveNum[i]);
        }

*/