import java.util.Scanner;
public class C8_ageGroup {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age= input.nextInt();
        if(age<=13){
            System.out.println(age+" : Child");
        }else if(age<=18){
            System.out.println(age+" : Teen");
        }else if(age<=60){
            System.out.println(age+" : Adult");
        }else{
            System.out.println(age+" : Senior Citizen ");
        }
    }
}
