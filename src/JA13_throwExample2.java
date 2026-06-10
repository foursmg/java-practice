public class JA13_throwExample2{
    public static void main(String[]args){
        int a=3;
        int b=0;
        System.out.println("1234");
        divide(a,b);
        System.out.println("ABCD"); //this won’t be executed
        // Program will end abruptly if divide method throw exception and excpetion is not handled
    }
    public static void divide(int a,int b){
        if(b==0){
            throw new ArithmeticException("Denominator cannot be zero"); // if throw is executed, rest of the code below in program won't be executed
        }
        int c= a/b;
        System.out.println(c);
    }
}
