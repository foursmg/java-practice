// Array
public class G1_array {
    public static void main(String[]args){

        String[] name; //declaring an array of type string
        name= new String[50]; //allocating memeory/size
        name[1]= "kelly";   // String is initialized using double quote

        //declaring and initializing an array
        int[] age= {23,54,1,77,42,4,12,66};
        //java compiler automatically specifies the size by counting the number of elements

        //initializing an array using index number
        int[] roll= new int[5];
        roll[1]= 34;

        //accessing the elemnet
        // var[index_number]
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(age[0]);  //array starts from 0 (index number)
        System.out.println(age[7]); //last index no. = total element-1= n-1
        System.out.println(roll[0]);
        System.out.println(roll[1]);


    }
}
