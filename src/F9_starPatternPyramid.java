public class F9_starPatternPyramid {
    public static void main(String[]args){
        int i,j,k;
        for(i=0;i<5;i++){
            //space
            for(j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(k=8;k>=i*2;k--){
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }
}

/*

 *********
  *******
   *****
    ***
     *

*/
//program star pattern
//