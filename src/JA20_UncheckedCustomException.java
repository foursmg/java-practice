//UnChecked Customised Exception
class UnderAgeExceptionnn extends RuntimeException
{
    UnderAgeExceptionnn()
    {
        super("You are Under age.");
    }
    UnderAgeExceptionnn(String message)
    {
        super(message);
    }
}
public class JA20_UncheckedCustomException{
    public static void main(String[]args)
    {
        int age = 14;
        try{
            if(age<18){
                throw new UnderAgeExceptionnn("Age Below than 18 not Eligible for Vote");
            }else{
                System.out.println("Eligible for Vote");
            }
        }catch(UnderAgeExceptionnn e){
            e.printStackTrace();
        }

    }
}

