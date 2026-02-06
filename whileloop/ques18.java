package whileloop;

import java.util.Scanner;

public class ques18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=scanner.nextInt();
        int i=1;
        int isprime=0;
        while(i<=n){
            if (n % i == 0){
                isprime++;
            }
            i++;
        }
        if(isprime == 2){
            System.out.println("prime number");
        }else{
            System.out.println("not prime number");
        }
    }
}
