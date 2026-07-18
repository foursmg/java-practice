import java.util.Enumeration;
import java.util.Vector;

public class L7_enumeration {
    public static void main(String[]args){

        Vector v = new Vector();
        v.add("Jelly");
        v.add("John");
        v.add(101);

        //System.out.println(v); [Jelly,John,101]

        Enumeration e = v.elements();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
    }
}
