//Skip H3 H4 H5, Do H6 and H7 methods instead
public class H5_stringBuffer {
    public static void main(String[]args){

        //StringBuffer is MUTABLE - modifies SAME object
        StringBuffer sb = new StringBuffer("Heloo");
        System.out.println(sb); //Heloo
        sb.append(" world");
        System.out.println(sb); //Heloo world, same object modified
        sb.append(", Happy World War III");
        System.out.println(sb); //Heloo world, Happy World War III, same object modified
        //only one object throughout- memeory efficient



        //StringBuffer Constructor, 4-Constructor

        //Constructor 1 - no argument - creates empty StringBuffer with DEFAULT capacity 16
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity());    //16 // new capacity= (old capacity * 2)+ 2;
        System.out.println(sb1.length());      //0

        //Constructor 2 - String argument
        //capacity = 16 + length of String
        StringBuffer sb2 = new StringBuffer("Apple");
        System.out.println(sb2.capacity());    //21 <-(16 + 5(apple))
        System.out.println(sb2.length());      //5 <-(apple)

        //Constructor 3- int argument
        //creates empty StringBuffer with Specified Capacity
        StringBuffer s3 = new StringBuffer(50);
        System.out.println(s3.capacity()); //50
        System.out.println(s3.length());   //0
        s3.append("NASA");
        System.out.println(s3);            //NASA
        System.out.println(s3.capacity()); //50 (specified capacity)
        System.out.println(s3.length());   //4

        // CONSTRUCTOR 4 — CharSequence argument
        CharSequence cs = "deepak";
        StringBuffer sb4 = new StringBuffer(cs);
        System.out.println(sb4.toString());   // deepak


        //StringBuffer methods

        //chartAt(int index)
        StringBuffer xyz = new StringBuffer("XYZ");
        System.out.println(xyz.charAt(1)); //Y
        //setcharAt(int index,char ch);
        xyz.setCharAt(1,'O');
        System.out.println(xyz); //XOZ

        //append() - Adds text,int,bool or anyother data type at the end
        StringBuffer name = new StringBuffer("apple");
        name.append(" pie");
        System.out.println(name); //apple pie
        name.append(101);
        System.out.println(name); //apple pie101

        //insert(int offset, various types) - inserts content at specified position
        StringBuffer animal = new StringBuffer("Elephant");
        animal.insert(5,"ANT ");
        System.out.println(animal); //ElephANT ant

        //replace(int start, int end(excluded), String str) - Replace character from Start to end with new string
        //replaced portion and new String can have different length
        StringBuffer naam = new StringBuffer("Aman kumar");
        naam.replace(0,2,"Arma"); //replacing 2 char from start with 4 character of new String
        System.out.println(naam);    //Armaan kumar

        //delete(int start, int end) - Deletes character from start to end(end excluded)
        StringBuffer abc= new StringBuffer("ABCDEFGHI");
        System.out.println(abc.delete(4,7)); //ABCDHI
        //deleteCharAt() - delete single character
        System.out.println(abc.deleteCharAt(5)); //ABCDH

        //reverse() reverse the entire StringBuffer content
        System.out.println(abc.reverse()); //HDCBA

        //ensureCapacity(int minimummCapacity)
        // Ensures StringBuffer has AT LEAST given capacity
        // If current capacity < minimum → expands to (current*2)+2
        StringBuffer SB = new StringBuffer();
        System.out.println(SB.capacity());    // 16 (default)

        SB.ensureCapacity(20);
        System.out.println(SB.capacity());    // 34 → (16*2)+2

        SB.ensureCapacity(100);
        System.out.println(SB.capacity());    // 100 → directly set (already > 34*2+2? No → 100)

        // Rule:// if minCapacity > (current*2)+2 → use minCapacity
       // if minCapacity < (current*2)+2 → use (current*2)+2


        //toString
        // Converts StringBuffer → String
        // Most commonly used at the END of StringBuffer operations
        StringBuffer SB1 = new StringBuffer();
        SB1.append("deepak").append(" kumar").append(" singh");

        String result = SB1.toString();
        System.out.println(result);            // deepak kumar singh
        System.out.println(result.getClass()); // class java.lang.String





    }
}
