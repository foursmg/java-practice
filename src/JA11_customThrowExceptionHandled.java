class VoteAgeException extends Exception{
    VoteAgeException(String message){
        super(message);
    }
}

public class JA11_customThrowExceptionHandled {
    public static void main(String[] args) {

        try {
            int age = 1;

            if(age < 18){
                throw new VoteAgeException("Age must be 18 or above.");
            }
            else{
                System.out.println("Eligible to vote");
            }

        } catch(VoteAgeException e){
            System.out.println(e);
        }
    }
}