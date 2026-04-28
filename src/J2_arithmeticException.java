public class J2_arithmeticException {
    public static void main(String[] args) {

        System.out.println("Hello");
        System.out.println("1,2,3");

        //ArithmeticException - Runtime exception - Unchecked
        int a = 23, b = 0, c;
        c = a / b;
        System.out.println(c);

        System.out.println("Hello world");
        System.out.println("1,2,3,4,5");
    }
}


//an ArithmeticException is a runtime exception thrown
// when an illegal or impossible mathematical operation is attempted
// Timing: It occurs at runtime (during program execution) rather than during compilation.
// Outcome: If not handled, it causes the program to terminate abruptly

//example:  Division by Zero: Attempting to divide an integer or calculate the modulo of an integer by zero
// (e.g., 10 / 0 or 10 % 0).