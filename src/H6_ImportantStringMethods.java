import java.util.Locale;

public class H6_ImportantStringMethods {
    public static void main(String[] args){

        String s = "Hello world";
        //charAt() method - Returns character at given index
        System.out.println(s.charAt(0)); //H
        System.out.println(s.charAt(5)); // (blank space)


        //length() - Return total numbers of character
        System.out.println(s.length()); // 11 (counts the space also)

        //isEmpty() - Returns true if length is 0// returns Boolean- true/false
        System.out.println(s.isEmpty()); //false
        String se = "";
        System.out.println(se.isEmpty()); //true

        //substring() method
        //substring(int beginIndex)- Returns substring from beginIndex to end
        System.out.println(s.substring(0)); //hellow world
        System.out.println(s.substring(5)); // world

        //subString(int beginIndex, int endIndex) - Returns subString from beginIndex to end
        //int EndIndex is excluded
        System.out.println(s.substring(1,5)); //ello
        System.out.println(s.substring(0,11)); //Hello world

        //toUpperCase
        System.out.println(s.toUpperCase()); //HELLO WORLD
        System.out.println(s.toLowerCase()); //hello world

        //trim()- Removes leading and trailing Spaces only
        String s1 ="  apple  ";
        System.out.println(s1.length()); //9 counts space also
        System.out.println(s1.trim());   //apple
        System.out.println(s1.trim().length()); //5 can be used like this also
        // s1.trim().length() will first trim the spaces from left and right, then it will count the length remaining characters
        // s1.length().trim() won't work since length will give result in num/integer and trim() works on char not num/integer

        //split() - Splits string into array based on delimiter
        String[] words = s.split("");
        //result words =['H','e','l','l','o',' ','w','o','r','l','d']
        System.out.println(words[1]); //e
        System.out.println(words[0]); //H
        System.out.println(words[5]); //(black space)

        //replace(char old,char new)- Replaces All occurrences of a character
        System.out.println(s.replace("H","C")); //Cello world
        //Original remains unchanged

        //replace(CharSequence old, CharSequence new)
        System.out.println(s.replace("Hello","Namaste"));//Namaste world

        //replaceAll(String regex, String replacement)
        String s2 = "hello 1234 world";
        System.out.println(s2); //Hello 1234 world
        System.out.println(s2.replaceAll("[0-9]","")); //Hello  world
        System.out.println(s2.replaceAll("[a-z]","")); //  1234

        //indexOf() - returns first occurrence - case sensitive
        System.out.println(s.indexOf("H")); //0
        System.out.println(s.indexOf("h")); //-1, returns -1 if not found

        //lastIndexOf() - returns last occurrence - case sensitive
        System.out.println(s.lastIndexOf("o")); //7

        //contains() - checks if string contains given substring(case sensitive)
        System.out.println(s.contains("ello")); //true
        System.out.println(s.contains("Helo")); //false

        //startsWith()
        System.out.println(s.startsWith("He")); //true
        System.out.println(s.startsWith("he")); //false
        //endswith()
        System.out.println(s.endsWith("ld")); //true

        //comparison Method - equals(), equalsIgnoreCase(), compareTo()
        //equals() -
        String sa = "apple";
        String sb = "banana";
        String sc = "apple";
        String sd = "Apple";
        System.out.println("Equals()-");
        System.out.println(sa.equals(sb)); //false
        System.out.println(sa.equals(sc));  //true
        System.out.println(sa.equals(sd)); //false, case sensitive

        //equalsIgnoreCase - compare content - case INsensitive
        System.out.println(sa.equalsIgnoreCase(sd)); //true

        //just keep in mind this method exists - no need to memorise this one
        //compareTo() - compare two String lexicographically(dictionary Order)
        //Returns - 0   -> Both String equals
        //   <0 or -ve  -> s1<s2, calling string comes AFTER argument
        //   >0 or +ve  -> s1>s2, calling String comes BEFORE argument
        String s10 ="a";
        String s11 ="A";
        System.out.println(s10.compareTo(s11)); //32, ASCII value of a=97, A=65 -> a-A = 97-65= 32;
        System.out.println(sa.compareTo(sb));  //-1, -ve, s6(apple) before s7(banana)
        System.out.println(sb.compareTo(sa)); // 1, +ve, s7(banana) after s6(apple)
        System.out.println(sa.compareTo(sc)); //0, equal
        System.out.println(sa.compareTo(sd));  //32, +ve, s9(Apple) before s6(apple)
        //compareToIgnoreCase() - case Insensitive,
        System.out.println(sa.compareToIgnoreCase(sd));// 0, equal


        //valueOf() - converts different types into a string.
        //Syntax- String.valueOf(data);
        int num = 10;
        double d = 5.5;
        boolean b= true;
        char c ='A';

        System.out.println(num+5); //15 since num is still integer

        //After this step
        //the output may look int, boolean double etc but actually are String now
        String sN = String.valueOf(num);
        String sD = String.valueOf(d);
        String sB = String.valueOf(b);
        String sC = String.valueOf(c);

        System.out.println(sN+5); //105 // since num has been converted into

        //the output all are actually string now after valueOf() method
        System.out.println(String.valueOf(num)); //10
        System.out.println(String.valueOf(d));   //5.5
        System.out.println(String.valueOf(b));   //true
        System.out.println(String.valueOf(c));   //A

        //intern() - 1.Checks if an equal string already exists in the string pool
        //           2. If YES -> returns the reference to that pooled string
        //           3. If NO -> adds the string to the pool and returns its reference

        String x= "cow"; //goes into String Pool directly
        String y= "cow"; //reuses same pool object
        String z = new String("cow"); //created on heap, outside pool

        System.out.println(x==y); //true - (same pool reference)
        System.out.println(x==z); //false - (z is on heap)

        //intern() in action
        String heapz = z.intern(); //returns the pool reference
        System.out.println(x==y);  //true (both x and y object refernce were already in heap)
        System.out.println(x==heapz); //true - (heapz now points to pool)

        //join(delimiter,element) - joins multiple strings together with a delimiter between them.
        String fruit = String.join("-","apple","banana","kiwi","orange");
        System.out.println(fruit); //apple-banana-kiwi-orange
        String cars= String.join(" ","toyota","honda","audi","bmw");
        System.out.println(cars); //toyota honda audi bmw
        String combo = String.join("*",fruit,cars);
        System.out.println(combo); //apple-banana-kiwi-orange*toyota honda audi bmw
    }
}
