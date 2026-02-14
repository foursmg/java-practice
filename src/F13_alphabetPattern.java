public class F13_alphabetPattern {
    public static void main(String[]args){
       // char letter='A'; //if initialized here output:- A BC DEF GHIJ KLMNO
        int i,j;
        for(i=0;i<5;i++) {
            char letter='A'; // if initialized here reset after outer loop next iteration Output: A AB ABC ABCD ABCDE
            for (j = 0; j <= i; j++) {
               // char letter='A'; //ref comment below
                System.out.print(letter);
                letter++;
            }
            System.out.print("\n");
        }
    }
}

// inner loop multiple times per row, it times it runs again "char letter='A' get created again, increment lost after each iteration"
/*

A
AB
ABC
ABCD
ABCDE

*/