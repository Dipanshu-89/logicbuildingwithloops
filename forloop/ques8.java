package forloop;

public class ques8 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            int j=1;
            int isprime=0;
            while(j<=i){
                if(i % j == 0){
                    isprime++;
                }
                j++;
            }
            if(isprime ==  2){
                System.out.println("prime number: "+i);
            }
        }
    }
}
