//Checked Customised Exception
class UnderAgeExceptionn extends Exception
{
    UnderAgeExceptionn()  //default constructor
    {
        super("You are Under age.");     //super passes the message to parent exception class.
    }
    UnderAgeExceptionn(String message)   //parameterized constructor, Allows coustom message
    {
        super(message);
    }
}
public class JA19_throwsCustomCheckedException{
    public static void main(String[]args) throws UnderAgeExceptionn
    {
        int age = 19;
        if(age<18){
            throw new UnderAgeExceptionn("Age less than 18 not Eligible for Vote.");  // here UnderAgeException("......") is calling parameterized constructor and hence it will custom message defined here
        }
        System.out.println("Eligible for Vote");


    }
}

//If we want to print default message defined in UnderAgeException class we can use -> throw new UnderAgeException();