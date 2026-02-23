//taking input in java
import java.util.Scanner; //first this line
public class A4_input{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in); //and this line imp for input

        System.out.print("Enter your age: ");
        int n = input.nextInt();

        System.out.print("Enter a String: ");
        String word= input.next();
        //pay attention to this string input and the next one
        //.next() -> only one string, stops at space
        //e.g. input-> Rohan drives blue skoda
        //     output-> Rohan

        input.nextLine(); //consumes leftover newline

        System.out.print("Enter String: ");
        String name= input.nextLine();
        //.nextLine() -> read full line
        // e.g. input -> Rohan drives blue skoda
        //      output -> Rohan drives blue skoda

        System.out.print("Enter a long: ");// when value is very large
        double num= input.nextDouble();

        System.out.print("Enter a double: ");// for decimal number
        double dNum= input.nextDouble();

        System.out.print("Enter a boolean: "); //boolean can be only true or false
        boolean bool = input.nextBoolean();

        System.out.print("Enter a character: ");
        char grade= input.next().charAt(0);
        //next() takes the word -> chartAt(0) reads the first character of that word

        System.out.println(n);
        System.out.println(word);
        System.out.println(name);
        System.out.println(num);
        System.out.println(dNum);
        System.out.println(bool);
        System.out.println(grade);



       input.close();
       //closes the scanner, releases the resources(memory+input Stream)
       //used in DB connection, network streams, real application
        // optional for small program, dsa, competitive programming
    }
}

//variable: Can start with -> letter,_,$
// but can't start with numbers
//Can contain numbers after first character
//variables are case-sensitive
//e.g. valid variables-> age, _age, $salary, marks2;
//     invalid variables-> 2marks;