//prime number till n
public class EA14_primeNumberTillN {
    public static void main(String[]args){
        int n=100;
        prime(n);
    }
    public static void prime(int n){
        int count=0;
        for(int i=2;i<=n;i++){
            int j=2;
            boolean prime = true;
            while(j<i){
                if(i%j==0){
                    prime=false;
                }
                j++;
            }
            if(prime){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("\nTotal Prime Numbers: "+count);
    }
}



/*

public class prime{
    public static void main(String[]args){
        int n=1000;
        for(int i=2;i<=n;i++){
             int j=2;
                int count=0;
            while(j<=i){
                if(i%j==0){
                    count++;
                }j++;
            }
            if(count<=1){
                System.out.print(i+" ");
            }
        }
    }
}




 */