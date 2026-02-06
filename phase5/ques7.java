package phase5;

import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the terms:");
        int n=scanner.nextInt();
        int sum=0;
        int f=0;
        int s=1;
        for(int i=1;i<=n;i++){
            sum+=f;
            int n_term=f+s;
            s=f;
            f=n_term;
        }
        System.out.println(sum);
    }
}
