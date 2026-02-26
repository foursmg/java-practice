public class G2_arrayLoop {
    public static void main(String[]args){

        int[] age={23,45,67,89,87,65};

        //arr.length = length of array (int value)
        //looping through array
        for(int i=0;i<age.length;i++){
            System.out.println(age[i]+" ");
        }
        System.out.println("Length of the array: "+ age.length);

        //for-each loop
        //alternative to above for loop, this one doesn't need the index
        //traversing the array using for-each loop
        for(int x: age){
            System.out.print(x+" ");
            //limitation: can't access particular index i.e.- age[i]
            //            Can't modify original array
        }
    }
}
