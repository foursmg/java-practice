public class H8_ReverseAString {
    public static void main(String[]args){
        String s= "ABCDE";
        String rev = ""; //a empty String rev
        for(int i=s.length()-1;i>=0;i--){
            rev= rev+ s.charAt(i);
        }
        System.out.println("String Before: "+s);
        System.out.print("After reverse: "+rev);
    }
}
