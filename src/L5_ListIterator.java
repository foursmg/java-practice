import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class L5_ListIterator {
    public static void main(String[]args){

        List l = new ArrayList();

        l.add("Box");
        l.add(52);
        l.add("Max");

        // Printing List Objects without Iterator
        System.out.println(l);  // [Box, 52, Max]

        // With iterator In Forward Direction
        ListIterator litr = l.listIterator();
        while(litr.hasNext())
        {
            System.out.println(litr.next());
        }

        System.out.println("-------------------");

        // In BackWard Direction
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
    }
}

// previous() returns elements because the cursor is currently at the end of the list after the forward traversal using next().