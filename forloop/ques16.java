package forloop;

import java.util.Scanner;

public class ques16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println((int) Math.pow(i,2));
        }
    }
}
