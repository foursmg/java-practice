//finding number of occurrences in an array using for-each loop
public class GA11_arrayNumOfOccurrencesForEachLoop {
    public static void main(String[]args){
        int[] arr= {21,33,45,32,12,67,43,33,22,67,33};
        int key = 33;
        int occ= occurrence(arr,key);
        if(occ>0){
            System.out.println("Number of occurrence: "+occ);
        }else {
            System.out.println("Element not Found In the array.");
        }
    }
    public static int occurrence(int[] num,int key){
        int count=0;
        for(int x : num){
            if(x==key){
                count++;
            }
        }
        return count;
    }
}
