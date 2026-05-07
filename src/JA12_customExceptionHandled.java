class UnderAgeException extends Exception{
    UnderAgeException(){   //default Exception HAndler
        super("You are Uder Age.");
    }
    UnderAgeException(String message){
        super(message);
    }
}
public class JA12_customExceptionHandled {
    public static void main(String[]args){
        int age = 4;
       try{
           if(age<18){
               throw new UnderAgeException();
           }
       }catch(UnderAgeException e){
           e.printStackTrace();
        }
    }
}
