public class J3_tryCatchArithmeticException {
    public static void main(String[] args) {

        System.out.println("Hello");
        System.out.println("1,2,3");


        //ArithmeticException - Runtime exception - Unchecked
        try{
            int a = 23, b = 0, c;
            c = a / b;
            System.out.println(c);
        }
        catch(ArithmeticException e){      //(Exception e) also works, Exception is parent class of all exception
            System.out.println(e);
            System.out.println("Cannot divide number by zero."); //manual message(Optional)
        }
        //after the above try & catch program will not stop abruptly in case of exception
        //below line will continue to execute


        System.out.println("Hello world");
        System.out.println("1,2,3,4,5");
    }
}


//(Exception e) also works, Exception is parent class of all exception
// But catching specific exception is better practice


//If no exception occurs inside the try block, the catch block is skipped,
// and the rest of the program executes normally.