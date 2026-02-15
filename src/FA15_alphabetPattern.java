public class FA15_alphabetPattern {
    public static void main(String[]args){
        int i,j;
        char letter= 'A';
        for(i=0;i<5;i++){
            for(j=0;j<=i;j++){
                System.out.print(letter);
            }
            System.out.print("\n");
            letter++;
        }
    }
}

/*

A
BB
CCC
DDDD
EEEEE

*/
