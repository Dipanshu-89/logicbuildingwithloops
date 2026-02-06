package phase5;

import java.util.Scanner;

public class ques13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println("enter the value of x:");
        int x=scanner.nextInt();
        int sum=1;
        for(int i=1;i<=n;i++){
            int c=(int)Math.pow(x,i);
            System.out.print(c+" ");
            sum+=c;
        }
        System.out.println();
        System.out.print(sum);
    }
}
