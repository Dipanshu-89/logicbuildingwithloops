package nestedloop;

import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of N: ");
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            int isprime=0;
            for(int j=1;j<=i;j++){
                if(i % j == 0){
                    isprime++;
                }
            }
            if(isprime == 2){
                System.out.println("prime number "+i);
            }
        }
    }
}
