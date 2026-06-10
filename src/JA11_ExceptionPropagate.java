public class JA11_ExceptionPropagate {
    public static void main(String[]args){
        System.out.println("123");
        try{
            divide();
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("456");
    }
    public static void divide(){
        int a=3, b=0;
        int c = a/b;  // Java automatically throws ArithmeticException
        System.out.println(c);

    }
}
