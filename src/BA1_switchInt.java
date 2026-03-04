public class BA1_switchInt {
    public static void main(String[]args){
        int day=3;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;            //if break statement is not used after each case
                                  //other cases below it is also going to get executed
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursayd");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Input.");
        }
    }
}
