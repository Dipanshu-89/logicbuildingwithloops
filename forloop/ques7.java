package forloop;

import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of N:");
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            int fact=1;
            for(int j=1;j<=i;j++){
                fact*=j;
            }
            System.out.println("factorial of "+i+" : "+fact);
        }
    }
}
