public class F2_starPattern {
    public static void main(String[]args){
        int i,j;
        for(i=0;i<5;i++){
            for(j=0;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.print("\n"); // System.out.println(""); since println moves the cursor to the next line
        }
    }
}

/*

 *
 *  *
 *  *  *
 *  *  *  *
 *  *  *  *  *

 */


/*
for n numbers of rows-

public class main{
    public static void main(String[]args){
        int n=10;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}



 */