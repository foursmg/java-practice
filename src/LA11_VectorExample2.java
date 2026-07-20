import java.util.*;
public class LA11_VectorExample2 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(Arrays.asList(10, 20, 30));

        vector.addElement(40);
        System.out.println("After addElement: " + vector); // [10, 20, 30, 40]

        System.out.println("Capacity: " + vector.capacity()); // internal array size (may be > size())
        System.out.println("Size: " + vector.size());         // 4

        vector.insertElementAt(5, 0);
        System.out.println("After insertElementAt: " + vector); // [5, 10, 20, 30, 40]

        System.out.println("First: " + vector.firstElement()); // 5
        System.out.println("Last: " + vector.lastElement());   // 40

        // Legacy Enumeration traversal
        Enumeration<Integer> e = vector.elements();
        System.out.print("Enumeration: ");
        while (e.hasMoreElements()) {
            System.out.print(e.nextElement() + " ");
        }
        System.out.println();

        vector.removeElementAt(0);
        System.out.println("After removeElementAt(0): " + vector);
    }
}