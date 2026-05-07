public class J8_tryCatchFinallyCombinations {
    public static void main(String[]args){
        try{


        }
        catch(ArithmeticException e){

        }finally{
            try{

            }
            catch(Exception e1){

            }
        }
    }
}


/*

INVALID - only try

public class J8_tryCatchFinallyCombinations {
    public static void main(String[]args){

        try{

        }

    }
}

----------------------------------------------------------

INVALID - Only catch

public class J8_tryCatchFinallyCombinations {
    public static void main(String[]args){
        catch(Exception e){

        }
    }
}

_________________________________________________________

INVALID - only finally

public class J8_tryCatchFinallyCombinations {
    public static void main(String[]args){
        finally{

        }
    }
}

-------------------------------------------------------------

VALID - try-catch

public class J8_tryCatchFinallyCombinations {
    public static void main(String[]args){
        try{

        }catch(Exception e){

        }
    }
}

----------------------------------------------------------

INVALID - try-catch(Exception e)-catch(Exception e)
All the Exception gets caught in the first catch, making it invalid
Exception is parent class of all exception.

public class J8_tryCatchFinallyCombinations {
    public static void main(String[]args){
        try{

        }catch(Exception e){

        }catch(Exception e){

        }
    }
}

-------------------------------------------------------------

INVALID – try – catch(Exception e) – catch(Any_Exception e)

Since Exception is parent class of all the exceptions, every exception will be caught in first catch
public class J8_tryCatchFinallyCombinations {
    public static void main(String[]args){
        try{

        }catch(Exception e){

        }catch(ArithmeticException e){

        }
    }
}

---------------------------------------------------------------------

INVALID – try-finally-catch(Exception_type e)

public class J8_tryCatchFinallyCombinations {
    public static void main(String[]args){
        try{

        }finally {

        }
        catch(ArithmeticException e){

        }
    }
}
------------------------------------------------------------

VALID – try-finally-try-catch()

public class J8_tryCatchFinallyCombinations {
    public static void main(String[]args){
        try{

        }finally {

        }try{

        }
        catch(ArithmeticException e){

        }
    }
}

---------------------------------------------------------------
VALID – Nested-try

public class J8_tryCatchFinallyCombinations {
    public static void main(String[]args){
        try{
            try{

            }
            catch(Exception e){

            }

        }
        catch(ArithmeticException e){

        }
    }
}

------------------------------------------------------------------

VALID – nested try inside catch

public class J8_tryCatchFinallyCombinations {
    public static void main(String[]args){
        try{


        }
        catch(ArithmeticException e){
            try{

            }
            catch(Exception e1){

            }
        }
    }
}


---------------------------------------------------------------

VALID – try+ multiple catch – finally

public class Main {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            System.out.println(arr[10]);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Exception");
        }
        finally {
            System.out.println("Cleanup done");
        }
    }
}

OUTPUT:  Array Exception
         Cleanup done


 */



























/*
INVALID - Only try

public class J8_tryCatchFinallyCombinations {
    public static void main(String[]args){

        try{

        }

    }
}

 */