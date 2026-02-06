package phase5;

import java.util.Scanner;

public class ques8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            System.out.print((int)Math.pow(i,2)+" ");
            sum+=(int)Math.pow(i,2);
        }
        System.out.print("\n"+sum);
    }
}
