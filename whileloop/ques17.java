package whileloop;

public class ques17 {
    // prime number print from 1 to 100
    public static void main(String[] args) {
        int n=1;
        while(n<=100){
            int isprime=0;
            int i=1;
            while(i<=n){
                if(n % i == 0){
                    isprime++;
                }
                i++;
            }
            if(isprime == 2){
                System.out.println(n);
            }
            n++;
        }
    }
}
