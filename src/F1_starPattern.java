public class F1_starPattern {
    public static void main(String[]args){
        int i,j;
        for(i=0;i<5;i++){                 //Outer loop for line/rows
            for(j=0;j<6;j++){             //inner loop for column and each element
                System.out.print(" * ");
            }                             //once the inner loop column printing ends and loop exits
            System.out.print("\n");       //we print new line so that we move to next row/line
        }
    }
}


/*

 *  *  *  *  *  *
 *  *  *  *  *  *
 *  *  *  *  *  *
 *  *  *  *  *  *
 *  *  *  *  *  *

 */