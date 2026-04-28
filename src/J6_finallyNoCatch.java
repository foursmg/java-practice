public class J6_finallyNoCatch {
    public static void main(String[]args){
        System.out.println("#####");

        try{
            int a=32, b=0, c;
            c= a/b;
            System.out.println(c);
        }finally{
            System.out.println("Finally Block.");
        }

        System.out.println("#####");
    }
}
