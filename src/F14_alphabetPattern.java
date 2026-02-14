public class F14_alphabetPattern {
    public static void main(String[]args){
        int i,j;
        for(i=0;i<5;i++){
            char letter= 'a';
            for(j=5;j>i;j--){
                System.out.print(letter+" ");
                letter++;
            }
            System.out.print("\n");
        }
    }
}

/*

a b c d e
a b c d
a b c
a b
a

*/