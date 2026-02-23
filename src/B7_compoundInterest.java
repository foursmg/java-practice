// Compound Interest = P*(1+r/100)^T; this formula gives amount-> principle+interest earned
// Actual compound interest= Amount- principle

import java.util.Scanner;
public class B7_compoundInterest{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);

        System.out.print("Enter the Principle: ");
        int p= input.nextInt();
        System.out.print("Enter the time: ");
        int t= input.nextInt();
        System.out.print("Enter the rate: ");
        float r= input.nextFloat();

        //Amount After Compound interest
        double ciAmount= p*Math.pow((1+r/100),t);   //float ci won't work here
        System.out.println("Amount: "+ciAmount);

        //Compound Interest
        //float amount= ciAmount-p; this would produce error as ciAmount is double and we have declared amount float
        double ci= ciAmount-p; //this would work
        //float amount= (float)ciAmount-p; this would also work
        System.out.println("Compound Interest is: "+ci);
    }
}
// a^b= Math.pow(a,b)
//Math.pow(a,b) always returns double
//always use double datatype when using Math.pow(a,b)