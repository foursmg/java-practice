import java.io.FileInputStream;
public class J1_exception{
    public static void main(String[]args){


        //----Checked Exception -> Compiler forces Handling----//

        // FileInputStream fis = new FileInputStream("d:/abc.txt");  //FileNotFoundException

        //Class.forName("com.mysql.jdbc.Driver");  //ClassNotFoundException



        //----Unchecked/RuntimeException -> no forced handling ----/

        //int a=100, b=0, c;  //ArithmeticException
        //c = a/b;
        //System.out.println(c);

        //String name = null;    //NullPointerException
        //System.out.println(name.length());
    }
}