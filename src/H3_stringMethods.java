public class H3_stringMethods {
    public static void main(String[]args){

        //Character & Index Based Methods
        //charAt() - Returns character at given index
        String s= "apple";
        System.out.println(s.charAt(3)); //l
        //System.out.println(s.charAt(5)); //error, out of bound

        //indexOf(char/String)     - returns first occurrence - case sensitive
        System.out.println(s.indexOf("p")); //1, returning first occurrence of p which is at index pos. 1
        System.out.println(s.indexOf("z")); //-1, returns -1 if not found

        //lastIndexOf(char/String) - returns last occurrence - case sensitive
        System.out.println(s.lastIndexOf("p")); //2
        System.out.println(s.lastIndexOf("Q")); //-1, since Q not present
        //length()
        //Returns total number of character
        System.out.println(s.length()); //5, it counts space as character also if space present
        int[] arr= {1,2,3};
        System.out.println(arr.length); //3,array uses property (no parentheses);


        //isEmpty()
        //Returns true if length is 0 //returns boolean- true/false
        String s1= "";
        String s2= "Apple";
        String s3= " ";
        System.out.println(s1.isEmpty()); //true
        System.out.println(s2.isEmpty()); //false
        System.out.println(s3.isEmpty()); //false, Space is present
        //isBlank, Returns Boolean - true/false,
        //same as isEmpty() except when only space present returns true
        System.out.println(s1.isBlank()); //true
        System.out.println(s2.isBlank()); //false
        System.out.println(s3.isBlank()); //true


        //trim()
        //Removes leading and trailing Spaces only
        String s4 ="    apple    ";
        System.out.println(s4.trim());          //apple
        System.out.println(s4.length());        //13, counts whitespace also
        System.out.println(s4.trim().length()); //5, first trims then counts
        //(s4.length().trim()) this would produce error as first length will be calculated
        // which will return integer, trim() can't apply to integer;
        //trim() doesn't removes whiteSpace from middle, only leftmost side and rightmost side
        String s5="     a PP l e    ";
        System.out.println(s5.trim()); //a PP l e


        //Comparison Methods
        //equals() - compares content - case sensitive-  Returns Boolean
        String s6= "apple";
        String s7= "banana";
        String s8="apple";
        String s9="Apple";
        System.out.println(s6.equals(s8));   //true, both apple
        System.out.println(s6.equals(s7));   //false, 1 apple 1 banana
        System.out.println(s6.equals(s9));   //false, equals() is case sensitive, here apple != Apple
        //equalsIgnoreCase() - compares content - case INsensitive - Returns Boolean
        System.out.println(s6.equalsIgnoreCase(s9));   //true

        //compareTo() - Compare two Strings lexicographically(dictionary Order)
        // Returns- 0         -> Both String equal,
        //          -ve or <0 -> s1<s2, calling string comes AFTER argument
        //          +ve or >0 -> s1>s2, calling string comes BEFORE argument
        String s10 ="a";
        String s11 ="A";
        System.out.println(s10.compareTo(s11)); //32, ASCII value of a=97, A=65 -> a-A = 97-65= 32;
        System.out.println(s6.compareTo(s7));  //-1, -ve, s6(apple) before s7(banana)
        System.out.println(s7.compareTo(s6)); // 1, +ve, s7(banana) after s6(apple)
        System.out.println(s6.compareTo(s8)); //0, equal
        System.out.println(s6.compareTo(s9));  //32, +ve, s9(Apple) before s6(apple)
        //compareToIgnoreCase() - case Insensitive,
        System.out.println(s6.compareToIgnoreCase(s9));// 0, equal


        //+ operator
        //s6="apple", s7="banana";
        System.out.println(s6+s7);    //applebanana
        System.out.println(s6+10);    //apple10
        System.out.println(20+s6+10); //20apple10
        System.out.println(s6+10+20); //apple1020, as first it will add first two String s6+10 =apple10, then apple10+20
        System.out.println(s6+120/20);//apple6,follows BODMAS(Bracket,of,Division, Multiplication,Addition and Subtraction
        //System.out.println(s6-10); error

        //concat() - joins two Strins - creates NEW String (immutable)
        String s12 = s6.concat(s7);
        System.out.println(s12); //applebanana
        System.out.println(s6); //apple, unchanged
        System.out.println(s7); //banana, unchanged
        // concat vs + operator:
        // both create new String
        // + can concatenate any type, concat() only String


        //join(delimiter,element)
        String fruit = String.join("-","apple","banana","dragonfruit");//apple-banana-dragonfruit
        System.out.println(fruit);
        String car = String.join(" ","Honda","Kia","Toyota");//Honda Kia Toyota
        System.out.println(car);
        String fc = String.join(" : ",fruit,car); //apple-banana-dragonfruit : Honda Kia Toyota
        System.out.println(fc);


        //Substring & Splitting Methods
        //substring(int beginIndex) - Returns substring from beginIndex to end
        String s13 = "Apple is a fruit";
        System.out.println(s13.substring(6)); //is a fruit
        //substring(int beginIndex,int endIndex) - endIndex is excluded
        System.out.println(s13.substring(6,10)); //is a
        System.out.println(s13.substring(0,5));  //apple
        // RULE: beginIndex inclusive, endIndex exclusive
        // length of result = endIndex - beginIndex

        //split() -
        //Splits string into array based on delimiter
        String[] words = s13.split(" ");
        System.out.println(words[2]); //a - follows 0 based indexing, 0-apple, 1-is, 2-a, 3-fruit
        System.out.println(words[3]); //fruit
        for(String x : words){       //can print the string array through loop also
            System.out.println(x); // apple - nextline - is - nextline - a - nextline - fruit
        }



    }
}
