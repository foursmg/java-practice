class BankAccount{

    private double balance;  //hidden - no direct access

    //getter - read access
    public double getBalance(){
        return balance;
    }

    //Balance should NOT be set directly, it must be controlled
    //replacing setter with controlled method
    //setter - write access with validation
    public void deposit(double amount){
        if(amount>0){
            balance += amount;
        }else{
            System.out.println("Invalid amount.");
        }
    }
}


public class IA21_encapsulationEx2 {
    public static void main(String[]args){

        BankAccount acc = new BankAccount();

        acc.deposit(1000);
        System.out.println("Balance is: "+acc.getBalance());

    }
}
