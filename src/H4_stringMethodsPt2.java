public class H4_stringMethodsPt2 {
    public static void main(String[]args){



        //replace(char old, char new)- Replaces All occurrences of a character
        String s= "apple";
        System.out.println(s.replace("p","k")); //akkle, boh p replaced by k
        //Original remains unchanged

        //replace(CharSequence old, CharSequence new)
        // Replaces ALL occurrences of a substring
        String s1= "apple banana apple";
        System.out.println(s1.replace("apple","mango")); //mango banana mango

        //replaceAll(String regex, String replacement)
        String s2= "apple12345banana";
        System.out.println(s2.replaceAll("[0-9]","")); //applebanana
        System.out.println(s2.replaceAll("[a-z]","")); //12345
        //can replace with something else also
        System.out.println(s2.replaceAll("[0-9]","-")); //apple-----banana
        System.out.println(s2.replaceAll("apple","mango")); //mango12345banana


        //Search and Check Methods
        //contains() - checks if string contains given substring - returns Boolean
        System.out.println(s1.contains("apple")); //true
        System.out.println(s1.contains("ship"));  //false
        //startswith()
        System.out.println(s1.startsWith("apple")); //true
        System.out.println(s1.startsWith("ap")); //true
        System.out.println(s1.startsWith("banana")); //false
        //endswith()
        System.out.println(s1.endsWith("le")); //true
        System.out.println(s1.endsWith("na")); //false


        //Modification methods
        //toupperCase()
        System.out.println(s.toUpperCase()); //APPLE
        //tolowerCase() similar

        //strip()
        // Like trim() but handles Unicode whitespace too
        // trim() only handles ASCII space (char <= 32)
        // strip() handles all Unicode spaces
        String s3 = "    apple    ";
        System.out.println(s3.trim()); //apple
        System.out.println(s3.stripLeading()); //apple
        System.out.println(s3.stripTrailing()); //    apple


        //Conversion Methods**
        //toCharArray()
        //converts String to Char array
        String c = "Toyota";
        char[] car = c.toCharArray();
        System.out.println(car[0]); // T
        System.out.println(car[5]); // a
        // useful for iterating character by character
        for (char x : car) {
            System.out.print(x + " ");  // T o y o t a
        }

        //valueOf(various types) - static ethods **
        String S1 = String.valueOf(123);    //int -> "123"
        String S2 = String.valueOf(12.43);  //double -> "12.43"
        String S3 = String.valueOf(true);   //boolean -> "true"
        String S4 = String.valueOf('a');    //char -> 'a'

        char[] chars = {'h','o','n','d','a'};
        String cars = String.valueOf(chars); //char[] -> "honda"
        System.out.println("\n"+S2); //12.43
        System.out.println(cars); //honda


        //intern()***
        // Moves String from heap to SCP
        // Returns reference of SCP object
        String x1 = new String("rose"); //x1 -> heap //2 object created 1 heap, 1scp; x1 reference pointing to heap object
        String x2 = x1.intern();                //x2 -> SCP // x2 object pointing to SCP
        String x3 = "rose";   // rose already exist in SCP , x3 pointing to rose in SCP
        System.out.println(x1==x2);  //false -> heap vs SCP
        System.out.println(x2==x3);  //true -> both in SCP, same object


    }
}
