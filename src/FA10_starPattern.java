public class FA10_starPattern {
    public static void main(String[]args){
        int i,j,k;

        //this loop is for the top half part of the star pattern (first 5 lines)
        //this loop(i) for shifting through lines/rows
        for(i=0;i<5;i++){           //first it will begin at line/row 1

            //for space
            for(j=0;j<=5-i-2;j++){  //2nd it will print space (4 spaces) in the first line
                System.out.print(" ");
            }

            //for star
            for(k=0;k<=2*i;k++){   //3rd it will print 1 star in the line one
                System.out.print("*");
            }
            System.out.print("\n"); //then it will move to next line and program will move back to first loop(i)
        }

        //once first half is done then program will reach to this part
        //this loop is for the bottom half part of the loop(last 4 lines)
        //for lines/rows
        for(i=0;i<5;i++){

            //space
            for(j=0;j<=i;j++){
                System.out.print(" ");
            }

            //star
            for(k=7;k>2*i;k--){
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
  *******
   *****
    ***
     *

*/

/*
to make pattern look better
put one extra space in beginning of print statement(line 11,16,28,33)(except new line(\n) print statement) i.e.-
System.out.print("  ");
System.out.print(" *");
System.out.print("  ");
System.out.print(" *");

Output:
         *
       * * *
     * * * * *
   * * * * * * *
 * * * * * * * * *
   * * * * * * *
     * * * * *
       * * *
         *

 */