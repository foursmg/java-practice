import java.util.ArrayList;
import java.util.List;
public class L4_iteratorRemove {
    public static void main(String[]args){

        List l = new ArrayList();
        l.add("Apple");
        l.add(65);
        l.add("Boy");

        System.out.println(l);

        l.remove("Boy");

        System.out.println(l);
    }
}
