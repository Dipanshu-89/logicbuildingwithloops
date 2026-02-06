package phase5;

import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the terms:");
        int n=scanner.nextInt();
        int f=0;
        int s=1;
        for(int i=1;i<=n;i++){
            System.out.println(f);
            int n_t=f+s;
            s=f;
            f=n_t;
        }
    }
}
