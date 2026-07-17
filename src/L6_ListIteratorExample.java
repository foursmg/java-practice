import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class L6_ListIteratorExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println("Original List: " + list);

        ListIterator<String> litr = list.listIterator();

        // Move to "B"
        litr.next();  // A
        litr.next();  // B

        // set() replaces the last element returned by next()
        litr.set("X");

        System.out.println("After set(): " + list);

        // add() adds at the current cursor position
        litr.add("Y");

        System.out.println("After add(): " + list);
    }
}