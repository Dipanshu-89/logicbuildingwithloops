package whileloop;

import java.util.Scanner;

public class ques25 {
    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=scannner.nextInt();
        int i=1;
        int sum=0;
        while(i<=n){
            if(n % i == 0){
                sum+=i;
            }
            i++;
        }
        System.out.println("sum of factor of the number: "+sum);
    }
}
