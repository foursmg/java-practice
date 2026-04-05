class Call{

    void calling(){
        System.out.println("Making a Call");
    }
}

class TeleCall extends Call{     //IS-A Call
    @Override
    void calling(){
        System.out.println("Making a telephone call");
    }
}

class WhatsAppCall extends Call{   //IS-A Call
    @Override
    void calling(){
        System.out.println("Making a WhatsApp Call ");
    }
}
public class IA17_polymorphism_runTimeEx3{
    public static void main(String[]args){

        //This one (c1) is Not polymorphism, No overriding involved here, normal method call
        Call c1 = new Call();  //normal Object creation of class Call
        c1.calling();          //Making a call, normal method call, no dispatch


        //runtime polymorphism
        //Runtime polymorphism works because of:
        //Upcasting (parent reference pointing to child object)
        Call c2 = new TeleCall();     //Upcasting, Parent reference -> Child Object
        c2.calling();                 //Making a tele Call - resolved at runtime
                                      //JVM checks actual object at runtime -> TeleCall's version

        Call c3 = new WhatsAppCall();  //Parent reference -> Child Object
        c3.calling();                  //Making a WhatsApp Call - resolved at runtime

    }
}