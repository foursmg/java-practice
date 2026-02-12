public class F8_starPattern {
    public static void main(String[]args){
        int i,j,k;
        for(i=0;i<5;i++){
            //space
            for(j=0;j<5-i-1;j++){
                System.out.print(" ");
            }
            //star
            for(k=0;k<=i*2;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

/*

     *
    ***
   *****
  *******
 *********

*/