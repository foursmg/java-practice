public class F12_printAlphabet {
    public static void main(String[]args){

        //1st method creating a character varibale, assiginig it an alphabet
        // charater are assigined in quote 'a' 'b' 'x' etc....
        char ch;
        for(ch='A';ch<'Z';ch++)
        {
            System.out.print(ch+" ");
        }
        System.out.print("\n");
        for(ch='a';ch<'z';ch++)
        {
            System.out.print(ch+" ");
        }
        System.out.print("\n");

        //2nd method Using ascii
        //A-65 Z-90 a-97, z-122
        int i;
        for(i=65;i<=90;i++){
            System.out.print((char)i+" ");
        }
        System.out.print("\n");
        for(i=97;i<=122;i++){
            System.out.print((char)i+" ");
        }
    }
}
