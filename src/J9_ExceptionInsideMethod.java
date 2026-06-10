public class J9_ExceptionInsideMethod {
    public static void main(String[]args){
        System.out.println("123");
        divide();
        System.out.println("456");  // Program won’t reach this line cause a line above a method was called which had an exception which was not handled
    }
    public static void divide(){
        int a=3, b=0;
        int c = a/b;
        System.out.println(c);
    }
}
