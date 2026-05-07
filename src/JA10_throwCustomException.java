//Example of throwing custom Exception
class voteAgeException extends Exception{
    voteAgeException(String message){
        super(message);
    }
}

public class JA10_throwCustomException {
    public static void main(String[]args) throws voteAgeException{

        int age=41;

        if(age<18){
            throw new voteAgeException("Age must be 18 or above.");
        }else{
            System.out.println("Eligible to vote");
        }

    }
}

//Exception hasn't been handled here



/*

for custom exception,
first we need to create our own custom exception class

class voteAgeException extends Exception{    //voteAgeException -> Custom exception class name, Usually ends with Exception
                                             // extends Exception -> tells Java -> This is an exception type.
                                             //by extending Exception, our class gets all exception behavior.
                                             //because it extends Exception, it becomes checked, Java forces either
                                             //handle using try-catch or declare using throws

    voteAgeException(String message){      //Constructor -> This Constructor receives the error message
                                           //example in this case: new InvalidAgeException("Age must be 18 or above")
                                           //above message is passed to constructor

        super(message);                     //This sends/passes the message to parent class (Exception)
                                            //Because Java's Exception class stores and manages error messages.
                                            //without this message won't show properly
    }
}

public class JA10_throwCustomException {
    public static void main(String[]args) throws voteAgeException{   //throw voteAgeException means:
                                                                   //"main() may generate this exception and I am not handling it here."
                                                                   //Since there is no try-catch, exception will propagate.
                                                                   //But main() is the final method.
                                                                   //So after reaching main(), JVM gives it to the default exception handler.

        int age=1;

        if(age<18){
            throw new voteAgeException("Age must be 18 or above.");   //this creates an object of class voteAgeException
                                           //same as writing : voteAgeException e = new voteAgeException("Age must be 18 or above");
        }else{
            System.out.println("Eligible to vote");
        }

    }
}



 */




/*

// ✅ Custom Exception Class
class VoteAgeException extends Exception {
    // Constructor — receives the error message
    VoteAgeException(String message) {
        super(message); // passes message to parent Exception class
    }
}

public class ThrowCustomException {

    // ✅ Method that validates age and throws custom exception
    static void validateAge(int age) throws VoteAgeException {
        if (age < 18) {
            throw new VoteAgeException("Age must be 18 or above. Your age: " + age);
        } else {
            System.out.println("Eligible to vote. Your age: " + age);
        }
    }

    public static void main(String[] args) {

        // ✅ Case 1 — age below 18, exception thrown
        try {
            validateAge(15);
        } catch (VoteAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // ✅ Case 2 — age 18 or above, no exception
        try {
            validateAge(20);
        } catch (VoteAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}


 */