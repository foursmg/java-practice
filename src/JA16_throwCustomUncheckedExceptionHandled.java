import java.util.Scanner;
class VoteAgeException extends RuntimeException
{
    VoteAgeException(String msg)
    {
        super(msg);
    }
}
public class JA16_throwCustomUncheckedExceptionHandled{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your age: ");
        int age = input.nextInt();
        try{
            if(age<18){
                throw new VoteAgeException("Age Cannot be less than 18 for vote.");
                //we cannot write any statement after throw statement
            }else{
                System.out.println("Eligibile for Vote.");
            }
        }
        catch(VoteAgeException e){
            e.printStackTrace();
        }

        System.out.println("1234"); //Since exception has been handled, program will execute fully

    }
}
