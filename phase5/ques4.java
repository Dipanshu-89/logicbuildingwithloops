package phase5;

import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first term of ap:");
        int first_term=scanner.nextInt();
        System.out.println("enter the common difference of ap");
        int second_term=scanner.nextInt();
        System.out.println("enter the terms:");
        int n=scanner.nextInt();
        int sum=first_term;
        for(int i=1;i<=n;i++){
            System.out.println(sum);
            sum+=second_term;
        }
    }
}
