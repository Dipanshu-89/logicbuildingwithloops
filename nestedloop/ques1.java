package nestedloop;

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i+" X "+j+" = "+i*j);
            }
            System.out.println();
        }
    }

}
