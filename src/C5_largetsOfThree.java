public class C5_largetsOfThree {
    public static void main(String[]args){
        int a= 2, b=65, c=9;
        if(a>b && a>c){
            System.out.println(a);
        }else if(b>a && b>c){
            System.out.println(b);
        }else
            System.out.println(c);
    }
}

//using tarnary operator
// int l= (a>b)?(a>c ? a : c) : (b>c? b: c);
//sout(l);