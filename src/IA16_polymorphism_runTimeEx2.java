// PaymentMethod is the parent/superclass
class PaymentMethod{
    void pay(){
        System.out.println("Payment is being Processed.");
    }
}

//UpiPayment IS-A PaymentMethod
class UpiPayment extends PaymentMethod{
    @Override
    void pay(){  //pay() overrides the parent's pay(), Provides UPI-specific behavior
        System.out.println("UPI Payment");
    }
}

//Same here, CreditCardPayment IS-A PaymentMethod
class CreditCardPayment extends PaymentMethod{
    @Override
    void pay(){    //pay() overrides the parent's pay(), Provides CreditCardPayment behavior
        System.out.println("Credit Card Payment.");
    }
}


public class IA16_polymorphism_runTimeEx2 {
    public static void main(String[]args){

        PaymentMethod p; //Declares a reference variable 'p' of type PaymentMethod
                          //Object Not created yet, 'p' is uninitialized at this point
                         //lives on the stack

        p= new PaymentMethod();   //Creates a `PaymentMethod` object on the heap, 'p' points to it
        p.pay();
        //`p.pay()` — reference type and object type are both `PaymentMethod`
        //Normal Call method, No Overriding involved

        p = new UpiPayment(); //`new UpiPayment()` creates a `UpiPayment` object on heap
        p.pay();              //Assigned to `p` — **upcasting** (child object → parent reference)
                              //Previous `PaymentMethod` object is now unreferenced → eligible for GC
                              //`p.pay()` — reference is `PaymentMethod` but object is `UpiPayment`
                              //JVM checks actual object at runtime → calls `UpiPayment`'s `pay()`
                              //Runtime polymorphism

        p = new CreditCardPayment();
        p.pay();

    }
}
