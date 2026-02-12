import com.sun.security.jgss.GSSUtil;

public class F4_startNumPattern {
    public static void main(String[]args){
        int i,j;
        for(i=0;i<5;i++){
            for(j=0;j<=i;j++){
                System.out.print(j+1);
            }
            System.out.println("");
        }
    }
}

/*

1
12
123
1234
12345

*/

/*

for(i=0;i<5;i++){
            for(j=0;j<=i;j++){
                System.out.print(i+1);
            }
            System.out.println("");
Output:-
         1
         22
         333
         4444
         55555

*/