public class F5_starNumPattern {
    public static void main(String[]args){
        int i,j;
        for(i=0;i<5;i++){
            for(j=0;j<5-i;j++){
                System.out.print(j+1);
            }
            System.out.print("\n");
        }
    }
}

/*

12345
1234
123
12
1

*/