public class BA3_switchString {
    public static void main(String[]args){
        String role="user";
        switch(role){
            case "admin":
                System.out.println("Full Access");
                break;
            case "user":
                System.out.println("Limited access");
                break;
            default:
                System.out.println("Guest");
        }
    }
}
