public class C9_mathClass {
    public static void main(String[]args){

        //abs(x) -> Returns the absolute (positive) value of x;
        System.out.println(Math.abs(-3.33)); //3.33

        //max(x,y) -> returns the greater of two values;
        System.out.println(Math.max(23,56)); //56

        //min(x,y) -> returns the smaller of two values
        System.out.println(Math.min(43,2)); //2

        //sqrt(x) -> returns the square root of x
        System.out.println(Math.sqrt(81)); //9.0

        //pow(base,exp) -> Returns the value of base raised to the power of exp
        System.out.println(Math.pow(3,3)); //27.0

        //round(x) -> Rounds x to the nearest integer
        System.out.println(Math.round(4.3)); //4

        //ceil(x) -> Rounds x up to the nearest integer
        System.out.println(Math.ceil(4.1)); //5.0

        //floor(x) -> Rounds x down to the nearest integer
        System.out.println(Math.floor(4.9)); //4.0

        //random() -> Returns a random double value between 0.0 and 1.0
        System.out.println(Math.random());



    }
}
