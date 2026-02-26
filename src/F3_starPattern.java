public class F3_starPattern {
    public static void main(String[]args){
        int i,j;
        for(i=0;i<5;i++){
            for(j=0;j<5-i;j++){    //for(j=0;j<=5-i-1;j++)  -> this will also work z
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}

/*

this also works

for(i=5;i>0;i--){
   for(j=0;j<i;j++){     //
   print(" * ");
   }
   print("\n")
}

*/
/*

 *  *  *  *  *
 *  *  *  *
 *  *  *
 *  *
 *

 */