import java.util.Vector;

public class LA10_Vector
{
    public static void main(String[] args)
    {
        Vector<String> vector = new Vector<>();

        // Adding elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Mango");
        vector.add("Banana"); // duplicate allowed

        System.out.println(vector);

        System.out.println("-------------------------");

        // Accessing first and last elements
        System.out.println("First Element: " + vector.firstElement());
        System.out.println("Last Element: " + vector.lastElement());

        System.out.println("-------------------------");

        // Updating element
        vector.set(1, "Orange");
        System.out.println(vector);

        System.out.println("-------------------------");

        // Removing element
        vector.remove("Apple");
        System.out.println(vector);

        System.out.println("-------------------------");

        // Using Vector as a Stack
        vector.add(0, "Grapes"); // equivalent to push at beginning
        vector.add("Pineapple"); // add at end
        System.out.println(vector);

        System.out.println("-------------------------");

        // Iterating Vector
        for(String fruit : vector)
        {
            System.out.println(fruit);
        }

    }
}