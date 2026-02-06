package phase5;

import java.util.Scanner;

public class ques12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of N:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            int fact=1;
            for(int j=1;j<=i;j++){
                fact*=j;
            }
            System.out.print(fact+" ");
            sum+=fact;
        }
        System.out.println("\nsum of factorial is: "+sum);
    }
}
