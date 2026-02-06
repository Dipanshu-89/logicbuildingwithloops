package nestedloop;

import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the value of N:");
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=i+1;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
