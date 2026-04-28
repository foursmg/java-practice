public class J4_methodsToPrintException {
    public static void main(String[]args){

        System.out.println("123");

        try{
            int a=100, b=0, c;
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){

            //methods to print Exception
            //e.printStackTrace();  //method 1
            //System.out.println(e);   //method 2
            //System.out.println(e.toString());   //method 2

            System.out.println(e.getMessage());   //method 3
        }

        System.out.println("4,5,6");

    }
}
