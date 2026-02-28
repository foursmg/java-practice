public class G3_sumAvgArray {
    public static void main(String[]args){
        int[] num= {45,764,2,34,87,453,11};

        int sum=0;
        for(int i=0;i<num.length;i++){
            sum=sum+num[i];
        }
        System.out.println("Length of the array is: "+num.length);
        System.out.println("Sum of the elements: "+sum);

        double avg = (double)sum/num.length;
        System.out.println("Avg of elements: "+avg);
    }
}

/*

(double)(sum/num.length) -wrong
(double)sum/num.length -right
sum/(double)num.length -right
(double)sum/double(num.length) -right

*/