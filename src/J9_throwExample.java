public class J9_throwExample {
    public static void main(String[]args){

        System.out.println("1,2,3,4");

        //manually throwing an exception, It's also an example of throwing built-in Java Exception(ArithmeticException)
        throw new ArithmeticException("throw message here!");

        //program will stop abruptly

    }
}