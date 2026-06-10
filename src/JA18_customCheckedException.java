//Checked Customized Exception
class UnderAgeException extends Exception
{
    UnderAgeException()  //default constructor
    {
        super("You are Under age.");     //super passes the message to parent exception class.
    }
    UnderAgeException(String message)   //parameterized constructor, Allows coustom message
    {
        super(message);
    }
}
public class JA18_customCheckedException{
    public static void main(String[]args)
    {
        int age = 17;
        try{
            if(age<18){
                throw new UnderAgeException();  // here UnderAgeException() is calling default constructor and hence it will print default message
            }else{
                System.out.println("Eligible for Vote!!! ");
            }
        }
        catch(UnderAgeException e){
            e.printStackTrace();
        }

    }
}

//If we want to print custom message we can use -> throw new UnderAgeException("......custom message here");