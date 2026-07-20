import java.util.Stack;
public class LA12_stack {
    public static void main(String[]args){

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack); // [10, 20, 30]

        System.out.println("Peek: " + stack.peek());   // 30 (top, not removed)
        System.out.println("Pop: " + stack.pop());     // 30 (removed)
        System.out.println("Stack after pop: " + stack); // [10, 20]

        System.out.println("Search 10: " + stack.search(10)); // 2 (1-based from top)
        System.out.println("Search 99: " + stack.search(99)); // -1 (not found)

        System.out.println("Empty? " + stack.empty()); // false
    }
}
