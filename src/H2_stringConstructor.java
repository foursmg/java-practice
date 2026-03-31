public class H2_stringConstructor {
    public static void main(String[]args){

        // 6 main String Constructor

        //Constructor 1 — No Argument Constructor
        String s1 = new String();               //No argument Constructor
        System.out.println(s1);                 //prints nothing (empty String)
        System.out.println(s1.length());        // to check if its empty constructor or print its length


        //Constructor 2 — String Argument Constructor
        // Most commonly used constructor, takes another String as argument
        String s2= new String("deepak"); //String literal(deepak) passed as argument
        String s3 = new String(s1);             //existing String object passes as argument

        System.out.println(s2);               //deepak
        System.out.println(s3);              //deepak
        System.out.println(s1==s2);          // false - two different object in heap <-> both created using new keyword
        System.out.println(s1.equals(s2));   //true - same content


        //Constructor 3 - StringBuffer Constructor
        // StringBuffer creates mutable object, can be modified
        StringBuffer sb = new StringBuffer("deepak"); // here deepak object is mutable
        System.out.println(sb);              //deepak
        sb.append("java");
        System.out.println(sb);             //deepakjava

        String s4 = new String(sb); //StringBuffer passed to String - now its immutable

        System.out.println(sb);           //deepakjava
        System.out.println(s4);          //deepakjava

        sb.append(" python");
        System.out.println(sb);      // deepakjava python
        System.out.println(s4);     //deepakjava- unchanged! because sb was passed to String and it became immutable


        //Constructor 4- StringBuilder same as StringBuffer

        //Constructor 5 — Byte Array Constructor
        //creates String from byte array, each byte is converted to corresponding character using default charset
        //byte array can be passed to String Constructor
        byte[] b ={100,101,102};
        String s = new String(b);      // ASCII values of alphabet( A-Z 65-90; a-z 97-122)
        System.out.println(s);        // def

        //Constructor 6 - CharacterArray Constructor
        //Creates String from a char array, This is how String stores data internally
        char[] c = {'a','p','p','l','e'};
        String s5 = new String(c);    //char array being passed to String Constructor
        System.out.println(s5);      //apple


    }
}
