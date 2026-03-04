public class BA2_multipleCaseSameCode {
    public static void main(String[]args){
        int day=4;
        switch(day){
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Weekdays");
                break;

            case 6: case 7:
                System.out.println("Weekend!!!");
                break;

            default:
                System.out.println("Enter a number between 1-7");
        }
    }
}
