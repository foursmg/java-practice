import java.util.ArrayList;
import java.util.Iterator;

public class L8_ArrayList {
    public static void main(String[]args){

        ArrayList al = new ArrayList();

        //Can Have Different data types
        al.add(23);
        al.add("Peach");
        al.add(true);
        al.add(3.33);

        //Can Have duplicate elements
        al.add(23);
        al.add(23);

        //Can have multiple Null

        al.add(null);
        al.add(null);


        System.out.println(al);  // [23, Peach, true, 3.33, 23, 23, null, null]

        // Remove method to remove elements using index Number, If String can write that string
        al.remove(4);
        al.remove(5);

        System.out.println(al); //[23, Peach, true, 3.33, 23, null]

        // addAll(),
        ArrayList al2 = new ArrayList();
        al2.add("Peacock");
        al2.add("Penguin");
        al2.add(43);

        al.addAll(al2);

        System.out.println(al);  // [23, Peach, true, 3.33, 23, null, Peacock, Penguin, 43]
        System.out.println(al2);  // [Peacock, Penguin, 43]

        //In case of removing String can provide string itself (Removes first occurrence only)
        al.remove("Peacock");
        // But in case of integer need to provide index number.
        al.remove(4);

        System.out.println(al);   // [23, Peach, true, 3.33, null, Penguin, 43]
        ArrayList al3 = new ArrayList();
        al3.add("Peach");
        al3.add(true);
        al3.add("GOAT");
        al3.add(43);

        System.out.println(al);  // [23, Peach, true, 3.33, null, Penguin, 43]
        System.out.println(al3);  // [Peach, true, GOAT, 43]

        //removeAll() - Removes the similar element from first ArrayList
        al.removeAll(al3);
        System.out.println(al); // [23, 3.33, null, Penguin]

        //al.clear();  // Removes all  the elements from ArrayList

        // contains() method is used to check if specified element is present in the given ArrayList or not, if its present it will return true else false
        System.out.println(al.contains(null));  //true

        //size(), retruns the number of elements
        System.out.println(al.size());  //4

        // get(), Accesses an element using its index
        System.out.println(al.get(0));   //23


        // set(), replaces an existing element.
        al.set(2,"Volly Ball");
        System.out.println(al);  // [23, 3.33, Volly Ball, Penguin]

        //indexOf()
        System.out.println(al.indexOf(3.33)); //1


        // Iterator
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
