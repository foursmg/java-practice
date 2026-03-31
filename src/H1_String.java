public class H1_String {
    public static void main(String[] args){

        //array of characters/ character array
        char[] c = {'a','p','p','l','e'};
        //if we print c right now
        for(char x: c){
            System.out.println(x);
        }
        //output will be char array output
        //a
        //p
        //p
        //l
        //e

        String s= new String(c);
        //here we are creating a String variable s using 'new' keyword
        //It passes the contents(values) of c into the String constructor,
        //It reads the values inside c, copies them into  a new String object
        //later changes in c won't affect the String s

        System.out.println(s);
        //Output; apple
        //here array of characters have become string
        //hence;- String = sequence of characters


        //Ways to create String Objects
        //method 1 - String literal
        String s1 = "Hello"; //this method Stores the String inside the String Constant pool
        String s2 = "Hello"; // Both s1 and s2 points to same object on SCP
        System.out.println(s1); //Hello
        System.out.println(s2); //Hello

        //method 2 - Using new Keyword
        String s3 = new String("Mango");
        //this method will Store the String object in SCP and Heap (2 object will be created)
        System.out.println(s3);



    }
}
