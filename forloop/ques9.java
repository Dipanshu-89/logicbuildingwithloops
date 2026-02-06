package forloop;

import java.util.Scanner;

public class ques9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of N:");
        int n=sc.nextInt();
        int isprime=0;
        for(int i=1;i<=n;i++){
            if(n % i == 0){
                isprime++;
            }
        }
        if(isprime == 2){
            System.out.println("prime number");
        }else{
            System.out.println("not a prime number");
        }
    }
}
