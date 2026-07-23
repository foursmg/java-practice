import java.util.*;

public class LA16_HashMap_waysToTraverseAndPrint {

    public static void main(String[] args) {

        // Creating a HashMap
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Rahul");
        students.put(102, "Amit");
        students.put(103, "Neha");
        students.put(104, "Priya");
        students.put(105, "Vikram");

        // ====================================================
        // 1. Print Entire HashMap
        // ====================================================
        System.out.println("1. Entire HashMap");
        System.out.println(students);

        // ====================================================
        // 2. Using entrySet() + Enhanced For Loop (Recommended)
        // ====================================================
        System.out.println("\n2. entrySet() + Enhanced For Loop");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // ====================================================
        // 3. Using keySet() + Enhanced For Loop
        // ====================================================
        System.out.println("\n3. keySet() + Enhanced For Loop");

        for (Integer key : students.keySet()) {
            System.out.println(key + " -> " + students.get(key));
        }

        // ====================================================
        // 4. Using values() + Enhanced For Loop
        // ====================================================
        System.out.println("\n4. values() + Enhanced For Loop");

        for (String value : students.values()) {
            System.out.println(value);
        }

        // ====================================================
        // 5. Using Iterator on entrySet()
        // ====================================================
        System.out.println("\n5. Iterator using entrySet()");

        Iterator<Map.Entry<Integer, String>> itr =
                students.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();

            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // ====================================================
        // 6. Using Iterator on keySet()
        // ====================================================
        System.out.println("\n6. Iterator using keySet()");

        Iterator<Integer> keyIterator = students.keySet().iterator();

        while (keyIterator.hasNext()) {
            Integer key = keyIterator.next();

            System.out.println(key + " -> " + students.get(key));
        }

        // ====================================================
        // 7. Using Iterator on values()
        // ====================================================
        System.out.println("\n7. Iterator using values()");

        Iterator<String> valueIterator = students.values().iterator();

        while (valueIterator.hasNext()) {
            System.out.println(valueIterator.next());
        }

        // ====================================================
        // 8. Using forEach() (Java 8)
        // ====================================================
        System.out.println("\n8. forEach() Method");

        students.forEach((key, value) ->
                System.out.println(key + " -> " + value));

        // ====================================================
        // 9. Using Lambda Expression
        // ====================================================
        System.out.println("\n9. Lambda Expression");

        students.entrySet().forEach(entry ->
                System.out.println(entry.getKey() + " -> " + entry.getValue()));

        // ====================================================
        // 10. Using Stream API
        // ====================================================
        System.out.println("\n10. Stream API");

        students.entrySet()
                .stream()
                .forEach(entry ->
                        System.out.println(entry.getKey()
                                + " -> "
                                + entry.getValue()));

        // ====================================================
        // 11. Printing Only Keys
        // ====================================================
        System.out.println("\n11. Only Keys");

        for (Integer key : students.keySet()) {
            System.out.println(key);
        }

        // ====================================================
        // 12. Printing Only Values
        // ====================================================
        System.out.println("\n12. Only Values");

        for (String value : students.values()) {
            System.out.println(value);
        }
    }
}