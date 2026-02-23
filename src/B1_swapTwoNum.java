//Swapping two numbers
public class B1_swapTwoNum {
    public static void main(String[] args){

        //using 3rd variable
        int a=6,b=7;
        int c;
        System.out.println("Before swap- A: "+a+" B: "+b);
        c=a;
        a=b;
        b=c;
        System.out.println("After swap- A: "+a+" B: "+b);

        //without using 3rd variable
        int p=5, q= 9;
        System.out.println("Before swap- P :"+p+" Q: "+q);
        p=p+q; //5+9 = 14
        q=p-q; //14-9= 5
        p=p-q; //14-5= 9
        System.out.println("After swap- P:"+p+" Q: "+q);

        //using xor
        int x=3, y=7;
        System.out.println("Before swap- X :"+x+" Y: "+y);
        x= x^y;  // 011^111= 100  = 4
        y= x^y;  // 100^111= 011  = 3
        x= x^y;  // 100^011= 111  = 7
        System.out.println("After swap- X :"+x+" Y: "+y);

    }
}

// XOR ^
//if both input bit different output = 1
//if both input bit same output = 0
//i.e.:- 1^0=1, 0^1=1, 1^1=0, 0^0=0
// 1^8= 0001^1000=1001=9

/*

revisit this after function topic

public class SwapDemo {

    static void swapFail(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void swapSuccess(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void main(String[] args) {

        int x = 5, y = 6;

        swapFail(x, y);
        System.out.println("After swapFail: " + x + " " + y);

        int[] arr = {5, 6};
        swapSuccess(arr);
        System.out.println("After swapSuccess: " + arr[0] + " " + arr[1]);
    }
}

*/