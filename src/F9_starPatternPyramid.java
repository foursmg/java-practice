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
/*

public class star{
    public static void main(String[]args){
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<9-2*i;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}


 */