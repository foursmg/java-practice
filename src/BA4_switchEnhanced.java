public class BA4_switchEnhanced {
    public static void main(String[]args){
        int day=2;
        String result =switch(day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Invalid Input";
        };
        System.out.println(result);
    }
}
