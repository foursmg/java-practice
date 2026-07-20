import java.util.LinkedList;
public class L9_LinkedList {
    public static void main(String[]args){

        LinkedList llist = new LinkedList();

        llist.add("Key");    // we can specify the index ourselves also  ll.add(0,"Key");
        llist.add("Lock");   // ll.add(1,"Lock");
        llist.add(3);        // ll.add(2,3);
        llist.add("Key");    // Duplicate allowed, can also store multiple null values

        System.out.println(llist);  // [Key, Lock, 3, Key]

                              //constructor 1
        LinkedList myll = new LinkedList();
        myll.add(10);
        myll.add(20);
        myll.add(30);
        System.out.println(myll);  //[10,20,30]

                            //constructor 2
        LinkedList ll = new LinkedList(myll);   // [10,20,30]

        System.out.println(ll);  // [10,20,30]

        // List methods
        ll.add(40);                    // [10,20,30,40]
        ll.add(0, 5);                  // [5,10,20,30,40]
        ll.set(1, 15);                 // [5,15,20,30,40]
        System.out.println("get(2): " + ll.get(2));       // 20
        System.out.println("indexOf(30): " + ll.indexOf(30)); // indexOf(30): 3

        // Deque methods
        ll.addFirst(0);                // [0,5,15,20,30,40]
        ll.addLast(50);                // [0,5,15,20,30,40,50]
        System.out.println("peekFirst: " + ll.peekFirst()); // peekFirst: 0
        System.out.println("peekLast: " + ll.peekLast());   // peekLast: 50
        ll.removeFirst();              // removes 0
        ll.removeLast();               // removes 50

        // Queue methods
        ll.offer(60);                   // add to tail
        System.out.println("poll: " + ll.poll()); //poll: 5   // removes & returns 5 (head)

        // Stack methods
        ll.push(1);                     // insert at head
        System.out.println("pop: " + ll.pop()); //pop:1   // removes & returns 1

        System.out.println("Final list: " + ll);  //Final list: [15, 20, 30, 40, 60]



    }
}
