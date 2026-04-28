public class J5_finallyBlock {
    public static void main(String[]args){
        System.out.println("******");

        try{
            int a=12, b=5,c;
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("This is a finally Block");
        }

        System.out.println("******");
    }
}



/*
Example 2 - Exception occurs -

public class J5_finallyBlock {
    public static void main(String[]args){
        System.out.println("*****");

        try{
            int a=12, b=0,c;
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("This is a finally Block");
        }

        System.out.println("*****");
    }
}

OUTPUT-

*****
java.lang.ArithmeticException: / by zero
This is a finally Block
*****


 */