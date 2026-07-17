import java.util.ArrayList;
public class L1_collectionAddMethod{
    public static void main(String[]args){

        // Can Add diferent type of data
        ArrayList AL = new ArrayList();    // raw type, No data type is specified
        AL.add("Kelly");    //String
        AL.add(23);         // integer
        AL.add(true);       // boolean


        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);

        ArrayList al2 = new ArrayList();
        al2.add("AAA");
        al2.add("BBB");
        al2.add("CCC");



        System.out.println(AL);
        System.out.println(al);
        System.out.println(al2);

        // addAll add all the object elemnt of one into another
        al.addAll(al2);

        System.out.println(al);
        System.out.println(al2);

        System.out.println(al.add("878"));  // true
        System.out.println(al);  // [100, 200, 300, AAA, BBB, CCC, 878]

    }
}