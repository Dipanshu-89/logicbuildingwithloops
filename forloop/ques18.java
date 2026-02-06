package forloop;

import java.util.Scanner;

public class ques18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a=scanner.nextInt();
        System.out.println("enter the value of b:");
        int b=scanner.nextInt();
        for(int i=a;i<=b;i++){
            if (i % 7 == 0 || 7 % i == 0){
                System.out.println(i);
            }
        }
    }

}
