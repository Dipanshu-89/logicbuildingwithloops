package forloop;

import java.util.Scanner;

public class ques17 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println((int)Math.pow(i,3));
        }
    }
}
