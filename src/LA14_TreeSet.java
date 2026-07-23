import java.util.TreeSet;
public class LA14_TreeSet {
    public static void main(String[]args){

        TreeSet ts = new TreeSet();
        ts.add(23);
        ts.add(93);
        ts.add(13);
        ts.add(53);
        ts.add(43);

        System.out.println(ts); // [13, 23, 43, 53, 93]

        // Common Operations

        // .first()
        System.out.println(ts.first());  // 13

        // .last()
        System.out.println(ts.last());   // 93

        // .higher()
        System.out.println(ts.higher(43));  // 53  (Strictly greater than 43)

        // .lower()
        System.out.println(ts.lower(43));   // 23

        // .ceiling()
        System.out.println(ts.ceiling(43));   //43

        // .floor()
        System.out.println(ts.floor(43));    //43


        // .pollFirst()
        System.out.println(ts.pollFirst());  // 13  (removes & return first element)

        System.out.println(ts);   // [23, 43, 53, 93]

        // .pollLast()
        System.out.println(ts.pollLast());   // 93

        System.out.println(ts);    // [23,43,53]


        //Can also have TreeSet of String type
        TreeSet ts1 = new TreeSet();
        ts1.add("Kelly");
        ts1.add("kelly");
        ts1.add("Mark");
        ts1.add("Jolyne");
        ts1.add("jolyne Cujoh");
        ts1.add("Light");

        System.out.println(ts1);  // [Jolyne, Kelly, Light, Mark, jolyne Cujoh, kelly]


    }

}
