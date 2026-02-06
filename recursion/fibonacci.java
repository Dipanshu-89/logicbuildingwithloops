package recursion;

public class fibonacci {
    public static int fibonacciNumber(int val){
        if(val==1){
            return 0;
        }
        else if(val==2){
            return 1;
        }
        return fibonacciNumber(val-1)+fibonacciNumber(val-2);
    }

    public static void main(String[] args) {
        int n=4;
        int re=fibonacciNumber(n);
        System.out.println(re);
    }
}
