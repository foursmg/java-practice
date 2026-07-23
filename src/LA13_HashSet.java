import java.util.HashSet;
import java.util.Iterator;

public class LA13_HashSet {
    public static void main(String[]args){

        HashSet hs = new HashSet();
        hs.add("Kelly");
        hs.add(3);
        hs.add(3.33);
        hs.add(true);

        //Elements are retrieved in random or unpredictable manner.
        System.out.println(hs);  // [3, 3.33, Kelly, true]

        Iterator itr = hs.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("-----------------");

        HashSet<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");          // ignored

        // .contains
        System.out.println(fruits.contains("banana"));;    // true

        // .remove()
        fruits.remove("apple");     // if printed returns true

        //.size()
        System.out.println(fruits.size());             // 1

        // .isEmpty()
        System.out.println(fruits.isEmpty());;              // false

        for (String f : fruits) {      // iteration order not guaranteed
            System.out.println(f);
        }

    }
}
