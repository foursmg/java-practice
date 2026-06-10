public class JA10_ExceptionHandledInMethod {
    public static void main(String[]args){
        System.out.println("123");
        divide();
        System.out.println("456");
    }
    public static void divide(){
        try{
            int a=3, b=0;
            int c = a/b;
            System.out.println(c);
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
    }
}
