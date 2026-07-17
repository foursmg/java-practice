import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class L3_iterator {
    public static void main(String[]args){

        List li = new ArrayList();

        li.add("Box");
        li.add(52);
        li.add("Max");

        // Printing List Objects without Iterator
        System.out.println(li);  // [Box, 52, Max]

        // With iterator
        Iterator itr = li.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
