package phase5;

import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the terms:");
        int n=scanner.nextInt();
        System.out.println("enter the first value:");
        int a=scanner.nextInt();
        System.out.println("enter the common ratio:");
        int r=scanner.nextInt();
        int gp=a;
        for(int i=1;i<=n;i++){
            System.out.print(gp+" ");
            gp*=r;
        }
    }
}
