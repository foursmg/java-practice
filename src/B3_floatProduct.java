//Product(multiplication) of two float numbers.
public class B3_floatProduct {
    public static void main(String[]args){

        //float a=3.56, b=4.32;
        //we can't declare float like this
        //decimal numbers are double by default in java

        //Right way to declare float in java
        float a=3.5666f, b=4.32f; //must add f or F at the end of float number
        float product= a*b;
        System.out.println(product);

        double x=3.5666, y=4.32;
        System.out.println(x*y);

    }
}

// float stores approximate values, has only 6-7 digit precision -> called floating point error
// prefer using double for decimal numbers
