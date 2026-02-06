package forloop;

import java.util.Scanner;

public class ques19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of N:");
        int n=scanner.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("sum of natural number is: "+sum);
    }
}
