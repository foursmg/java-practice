import java.util.ArrayList;
public class L2_collectionInterfaceMethods{
    public static void main(String[]args){



        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);

        // .contains checks whethe the object contains an element of not
        // .conatins returns boolean
        System.out.println(al.contains(100));
        System.out.println(al.contains(121));

        // .isEmpty checks if object impty of not (returns boolean)
        System.out.print(al.isEmpty()); // false

        ArrayList AL = new ArrayList();
        System.out.println(AL.isEmpty());  // true


        // .size() returns the current size of the object
        System.out.println(al.size());  // 3

        // .reomve removes the item at specified Index
        al.remove(1);
        System.out.println(al);  // [100, 300]

        AL.add("AAA");
        AL.add("BBB");
        AL.add("CCC");
        System.out.println(AL);   // [AAA, BBB, CCC]
        AL.remove("CCC");   // But String can be removed without index number
        System.out.println(AL);    // [AAA, BBB]
        AL.add("CCC");
        System.out.println(AL);    // [AAA,BBB,CCC]

        // .removeAll removes from list1 all elements that are also present in list2.
        ArrayList AL2 = new ArrayList();
        AL2.add("BBB");
        AL2.add("CCC");
        AL2.add("DDD");

        AL.removeAll(AL2);
        System.out.println(AL);   // [AAA]
        System.out.println(AL2);   // [BBB, CCC, DDD]


        // .clear() to clear all the elements
        AL.clear();
        System.out.println(AL);  // []


    }
}